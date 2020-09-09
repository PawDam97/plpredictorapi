package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.TeamStrength;
import pl.plpredictorapi.services.TeamStrengthServices;

import java.util.List;

@RestController
public class TeamStrengthApi {
    @Autowired
    private TeamStrengthServices services;
    @GetMapping("/TeamStrength")
    public List<TeamStrength> list(){
        return services.listAll();
    }
    @GetMapping("/TeamStrength/{clubId}")
    public TeamStrength get(@PathVariable Integer clubId){
        return services.get(clubId);
    }
}
