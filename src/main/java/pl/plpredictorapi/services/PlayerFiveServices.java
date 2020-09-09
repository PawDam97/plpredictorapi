package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.PlayerFiveRepository;
import pl.plpredictorapi.repos.entites.PlayerStatsFive;


import java.util.List;

@Service
public class PlayerFiveServices {
    @Autowired
    private PlayerFiveRepository playerFiveRepo;

    public List<PlayerStatsFive> listAll() {
        return playerFiveRepo.findAll();
    }
    public void save(PlayerStatsFive playerStatsFive){
        playerFiveRepo.save(playerStatsFive);
    }
    public PlayerStatsFive get(Integer PlayerId){
        return  playerFiveRepo.findById(PlayerId).get();
    }
    public void delete(Integer PlayerId){
        playerFiveRepo.deleteById(PlayerId);
    }
}
