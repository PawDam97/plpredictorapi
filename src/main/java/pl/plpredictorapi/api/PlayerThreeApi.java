package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.PlayerStatsThree;
import pl.plpredictorapi.services.PlayerThreeServices;

import java.util.List;
@RestController
public class PlayerThreeApi {
    @Autowired
    private PlayerThreeServices services;
    @GetMapping("/PlayerThree")
    public List<PlayerStatsThree> list(){
        return services.listAll();
    }
}
