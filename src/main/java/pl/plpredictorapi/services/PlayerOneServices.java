package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.PlayerOneRepository;
import pl.plpredictorapi.entites.PlayerStatsOne;

import java.util.List;

@Service
public class PlayerOneServices {

    @Autowired
    private PlayerOneRepository playerOneRepo;

    public List<PlayerStatsOne> listAll() {
        return playerOneRepo.findAll();
    }
    public void save(PlayerStatsOne playerStatsOne){
        playerOneRepo.save(playerStatsOne);
    }
    public PlayerStatsOne get(Integer PlayerId){
        return  playerOneRepo.findById(PlayerId).get();
    }
    public void delete(Integer PlayerId){
        playerOneRepo.deleteById(PlayerId);
    }
}
