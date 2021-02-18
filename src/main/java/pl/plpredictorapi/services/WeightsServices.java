package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.WeightsRepository;
import pl.plpredictorapi.entites.Weights;

import java.util.List;

@Service
public class WeightsServices {

    @Autowired
    private WeightsRepository weightsRepository;

    public List<Weights> listAll() {
        return weightsRepository.findAll();
    }
    public void save(Weights weights){
        weightsRepository.save(weights);
    }
    public Weights getById(Integer weightsId){
        return  weightsRepository.findById(weightsId).get();
    }
    public void delete(Integer weightsId){
        weightsRepository.deleteById(weightsId);
    }
}
