package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.TeamsStrengths;
import pl.plpredictorapi.repos.entites.Weights;
import pl.plpredictorapi.services.WeightsServices;

import java.util.List;

@RestController
public class WeightsApi {
    @Autowired
    private WeightsServices weightsServices;
    @GetMapping("/Weights")
    public List<Weights> list(){
        return weightsServices.listAll();
    }
    @GetMapping("/Weights/{weightsId}")
    public Weights get(@PathVariable Integer weightsId){
        return weightsServices.getById(weightsId);
    }
}
