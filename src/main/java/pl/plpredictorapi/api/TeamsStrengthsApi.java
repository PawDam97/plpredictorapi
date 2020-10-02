package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.TeamsStrengths;
import pl.plpredictorapi.services.TeamsStrengthsServices;

import java.util.List;

@RestController
public class TeamsStrengthsApi {
    @Autowired
    private TeamsStrengthsServices services;
    @GetMapping("/TeamsStrengths")
    public List<TeamsStrengths> list(){
        return services.listAll();
    }
    @GetMapping("/TeamsStrengths/{id}")
    public TeamsStrengths get(@PathVariable Integer id){
        return services.get(id);
    }
}
