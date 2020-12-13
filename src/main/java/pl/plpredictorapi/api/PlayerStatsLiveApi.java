package pl.plpredictorapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.PlayerStatsLive;
import pl.plpredictorapi.repos.entites.TableLive;
import pl.plpredictorapi.services.PlayerStatsLiveServices;
import pl.plpredictorapi.services.TableLiveServices;

@RestController
@RequestMapping("/playerLive")
public class PlayerStatsLiveApi {
    private PlayerStatsLiveServices playerStatsLiveServices;

    public PlayerStatsLiveApi(PlayerStatsLiveServices playerStatsLiveServices){
        this.playerStatsLiveServices = playerStatsLiveServices;
    }
    @GetMapping("/playerLive")
    public Iterable<PlayerStatsLive> list(){
        return playerStatsLiveServices.list();
    }

    @GetMapping("/save")
    public void savePlayerStats(){
        playerStatsLiveServices.savePlayerStats();
    }
}
