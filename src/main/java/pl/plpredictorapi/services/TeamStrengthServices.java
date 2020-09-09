package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.TeamStrengthRepository;
import pl.plpredictorapi.repos.entites.TeamStrength;

import java.util.List;

@Service
public class TeamStrengthServices {
    @Autowired
    private TeamStrengthRepository teamStrengthRepo;

    public List<TeamStrength> listAll() {
        return teamStrengthRepo.findAll();
    }

    public void save(TeamStrength teamStrength){
        teamStrengthRepo.save(teamStrength);
    }
    public TeamStrength get(Integer clubId){
        return  teamStrengthRepo.findById(clubId).get();
    }
    public void delete(Integer Id){
        teamStrengthRepo.deleteById(Id);
    }
}
