package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.PlayerStatsFive;
import pl.plpredictorapi.services.PlayerFiveServices;

import java.util.List;

@RestController
public class PlayerFiveApi {
    @Autowired
    private PlayerFiveServices services;
    @GetMapping("/PlayerFive")
    public List<PlayerStatsFive> list(){
        return services.listAll();
    }
}
