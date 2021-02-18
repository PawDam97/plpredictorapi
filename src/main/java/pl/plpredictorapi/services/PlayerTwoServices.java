package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.PlayerTwoRepository;
import pl.plpredictorapi.entites.PlayerStatsTwo;

import java.util.List;

@Service
public class PlayerTwoServices {
    @Autowired
    private PlayerTwoRepository playerTwoRepo;

    public List<PlayerStatsTwo> listAll() {
        return playerTwoRepo.findAll();
    }
    public void save(PlayerStatsTwo playerStatsTwo){
        playerTwoRepo.save(playerStatsTwo);
    }
    public PlayerStatsTwo get(Integer PlayerId){
        return  playerTwoRepo.findById(PlayerId).get();
    }
    public void delete(Integer PlayerId){
        playerTwoRepo.deleteById(PlayerId);
    }
}
