package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.PlayerStatsOne;
import pl.plpredictorapi.services.PlayerOneServices;

import java.util.List;

@RestController
public class PlayerOneApi {

    @Autowired
    private PlayerOneServices services;
    @GetMapping("/PlayerOne")
    public List<PlayerStatsOne> list(){
        return services.listAll();
    }
}
