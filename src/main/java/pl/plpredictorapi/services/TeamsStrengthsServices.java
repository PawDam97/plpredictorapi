package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.TeamsStrengthsRepository;
import pl.plpredictorapi.entites.TeamsStrengths;

import java.util.List;

@Service
public class TeamsStrengthsServices {
    @Autowired
    private TeamsStrengthsRepository teamsStrengthsRepo;

    public List<TeamsStrengths> listAll() {
        return teamsStrengthsRepo.findAll();
    }

    public void save(TeamsStrengths teamsStrengths){
        teamsStrengthsRepo.save(teamsStrengths);
    }
    public TeamsStrengths get(Integer id){
        return  teamsStrengthsRepo.findById(id).get();
    }
    public void delete(Integer Id){
        teamsStrengthsRepo.deleteById(Id);
    }
}
