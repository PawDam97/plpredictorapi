package pl.plpredictorapi.services;

import org.springframework.data.domain.Sort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.plpredictorapi.jsons.nextfixtures.Fixture;
import pl.plpredictorapi.jsons.nextfixtures.NextFixturesTable;
import pl.plpredictorapi.jsons.playerStats.PlayerStatsTable;
import pl.plpredictorapi.jsons.playerStats.Topscorer;
import pl.plpredictorapi.repos.NextFixtureRepository;
import pl.plpredictorapi.repos.PlayerStatsLiveRepository;
import pl.plpredictorapi.repos.entites.NextFixture;
import pl.plpredictorapi.repos.entites.PlayerStatsLive;

import java.util.List;

@Service
public class PlayerStatsLiveServices {
    private PlayerStatsLiveRepository playerStatsLiveRepository;
    public PlayerStatsLiveServices(PlayerStatsLiveRepository playerStatsLiveRepository) { this.playerStatsLiveRepository = playerStatsLiveRepository; }

    public Iterable<PlayerStatsLive> list() {
        return playerStatsLiveRepository.findAll(Sort.by(Sort.Direction.DESC,"totalGoals"));
    }

    public Iterable<PlayerStatsLive> save(List<PlayerStatsLive> playerStatsLiveList) {
        return playerStatsLiveRepository.saveAll(playerStatsLiveList);
    }

    public void savePlayerStats() {
        RestTemplate template = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("x-rapidapi-host", "api-football-v1.p.rapidapi.com");
        httpHeaders.add("x-rapidapi-key", "ad53fe4823msh08e98e190c82629p19577djsn5a6af4d40f2c");
        HttpEntity<String> entity = new HttpEntity<>("body", httpHeaders);
        ResponseEntity<PlayerStatsTable> exchange =
                template.exchange("https://api-football-v1.p.rapidapi.com/v2/topscorers/2790", HttpMethod.GET, entity,
                        PlayerStatsTable.class);
        List<Topscorer> topscorerTable = exchange.getBody().getApiPlayer().getTopscorers();

        for (Topscorer topscorer : topscorerTable) {
            PlayerStatsLive tl;
            List<PlayerStatsLive> existing = playerStatsLiveRepository.getById(topscorer.getPlayerId());
            if (!existing.isEmpty()) {
                tl = existing.get(0);
            } else {
                tl = new PlayerStatsLive();
            }
            tl.setPlayerId(topscorer.getPlayerId());
            tl.setFirstname(topscorer.getFirstname());
            tl.setLastname(topscorer.getLastname());
            tl.setTeamName(topscorer.getTeamName());
            tl.setMinutesPlayed(topscorer.getGames().getMinutesPlayed());
            tl.setTotalGoals(topscorer.getGoals().getTotal());
            //tl.setTotalAssists(topscorer.getGoals().getAssists());
            tl.setRedCards(topscorer.getCards().getRed());
            tl.setYellowCards(topscorer.getCards().getYellow());
            tl.setShoots(topscorer.getShots().getTotal());
            tl.setPenalties(topscorer.getPenalty().getSuccess());
            playerStatsLiveRepository.save(tl);
        }
    }
}
