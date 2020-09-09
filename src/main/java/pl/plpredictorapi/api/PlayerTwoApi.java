package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.PlayerStatsTwo;
import pl.plpredictorapi.services.PlayerTwoServices;

import java.util.List;
@RestController
public class PlayerTwoApi {
    @Autowired
    private PlayerTwoServices services;
    @GetMapping("/PlayerTwo")
    public List<PlayerStatsTwo> list(){
        return services.listAll();
    }
}
