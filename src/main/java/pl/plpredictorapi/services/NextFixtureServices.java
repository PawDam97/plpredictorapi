package pl.plpredictorapi.services;

import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;

import org.springframework.web.client.RestTemplate;
import pl.plpredictorapi.jsons.nextfixtures.Fixture;
import pl.plpredictorapi.jsons.nextfixtures.NextFixturesTable;
import pl.plpredictorapi.repos.NextFixtureRepository;
import pl.plpredictorapi.entites.NextFixture;


@Service
public class NextFixtureServices {
    private NextFixtureRepository nextFixtureRepository;
    public NextFixtureServices(NextFixtureRepository nextFixtureRepository) { this.nextFixtureRepository = nextFixtureRepository; }

    public Iterable<NextFixture> list() {
        return nextFixtureRepository.findAll(Sort.by("date"));
    }

    public Iterable<NextFixture> save(List<NextFixture> nextFixtureList) {
        return nextFixtureRepository.saveAll(nextFixtureList);
    }

    public void delete(){
        nextFixtureRepository.deleteAll();
    }


    public void saveNextFixture() {
        RestTemplate template = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
        httpHeaders.add("x-rapidapi-key", "key");
        HttpEntity<String> entity = new HttpEntity<>("body", httpHeaders);
        ResponseEntity<NextFixturesTable> exchange =
                template.exchange("https://api-football-v1.p.rapidapi.com/v2/fixtures/league/2790/next/30", HttpMethod.GET, entity,
                        NextFixturesTable.class);
        List<Fixture> fixtureTable = exchange.getBody().getApi().getFixtures();

        for (Fixture fixtures : fixtureTable) {
            NextFixture tl;
            List<NextFixture> existing = nextFixtureRepository.getByFixtureId(fixtures.getFixtureId());
            if (!existing.isEmpty()) {
                tl = existing.get(0);
            } else {
                tl = new NextFixture();
            }
            tl.setRoundNumber(fixtures.getRound());
            tl.setHomeTeam(fixtures.getHomeTeam().getTeamName());
            tl.setAwayTeam(fixtures.getAwayTeam().getTeamName());
            tl.setDate(fixtures.getEventDate());
            tl.setHomeTeamId(fixtures.getHomeTeam().getTeamId());
            tl.setAwayTeamId(fixtures.getAwayTeam().getTeamId());
            tl.setFixtureId(fixtures.getFixtureId());
            nextFixtureRepository.save(tl);
        }
    }
}
