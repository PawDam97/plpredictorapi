package pl.plpredictorapi.services;

import org.springframework.data.domain.Sort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.plpredictorapi.jsons.lastfixtures.LastFixturesTable;
import pl.plpredictorapi.jsons.nextfixtures.Fixture;
import pl.plpredictorapi.repos.LastFixtureRepository;
import pl.plpredictorapi.entites.LastFixture;

import java.util.List;

@Service
public class LastFixtureServices {
    private LastFixtureRepository lastFixtureRepository;
    public LastFixtureServices(LastFixtureRepository lastFixtureRepository) { this.lastFixtureRepository = lastFixtureRepository; }
    public Iterable<LastFixture> list() {
        return lastFixtureRepository.findAll(Sort.by(Sort.Direction.DESC,"date"));
    }
    public Iterable<LastFixture> save(List<LastFixture> lastFixtureList) {
        return lastFixtureRepository.saveAll(lastFixtureList);
    }
    public LastFixture get(Integer fixtureId){
        return  lastFixtureRepository.findById(fixtureId).get();
    }
    public void delete(){
        lastFixtureRepository.deleteAll();
    }

    public void saveLastFixture() {
        RestTemplate template = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
        httpHeaders.add("x-rapidapi-key", "key");
        HttpEntity<String> entity = new HttpEntity<>("body", httpHeaders);
        ResponseEntity<LastFixturesTable> exchange =
                template.exchange("https://api-football-v1.p.rapidapi.com/v2/fixtures/league/2790/last/50", HttpMethod.GET, entity,
                        LastFixturesTable.class);
        List<Fixture> fixtureTable = exchange.getBody().getApi().getFixtures();

        for (Fixture fixtures : fixtureTable) {
            LastFixture tl;
            List<LastFixture> existing = lastFixtureRepository.getByFixtureId(fixtures.getFixtureId());
            if (!existing.isEmpty()) {
                tl = existing.get(0);
            } else {
                tl = new LastFixture();
            }
            tl.setRoundNumber(fixtures.getRound());
            tl.setHomeTeam(fixtures.getHomeTeam().getTeamName());
            tl.setAwayTeam(fixtures.getAwayTeam().getTeamName());
            tl.setDate(fixtures.getEventDate());
            tl.setHalftime(fixtures.getScore().getHalftime());
            tl.setFulltime(fixtures.getScore().getFulltime());
            tl.setFixtureId(fixtures.getFixtureId());
            lastFixtureRepository.save(tl);
        }
    }
}
