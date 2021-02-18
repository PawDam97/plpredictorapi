package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.entites.PlayerStatsFour;
import pl.plpredictorapi.services.PlayerFourServices;

import java.util.List;
@RestController
public class PlayerFourApi {
    @Autowired
    private PlayerFourServices services;
    @GetMapping("/PlayerFour")
    public List<PlayerStatsFour> list(){
        return services.listAll();
    }
}
