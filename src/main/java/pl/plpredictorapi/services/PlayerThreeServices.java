package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.PlayerThreeRepository;
import pl.plpredictorapi.entites.PlayerStatsThree;

import java.util.List;
@Service
public class PlayerThreeServices {
    @Autowired
    private PlayerThreeRepository playerThreeRepo;

    public List<PlayerStatsThree> listAll() {
        return playerThreeRepo.findAll();
    }
    public void save(PlayerStatsThree playerStatsThree){
        playerThreeRepo.save(playerStatsThree);
    }
    public PlayerStatsThree get(Integer PlayerId){
        return  playerThreeRepo.findById(PlayerId).get();
    }
    public void delete(Integer PlayerId){
        playerThreeRepo.deleteById(PlayerId);
    }
}
