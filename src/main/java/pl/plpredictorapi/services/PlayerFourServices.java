package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.PlayerFourRepository;
import pl.plpredictorapi.repos.entites.PlayerStatsFour;

import java.util.List;
@Service
public class PlayerFourServices {
    @Autowired
    private PlayerFourRepository playerFourRepo;

    public List<PlayerStatsFour> listAll() {
        return playerFourRepo.findAll();
    }
    public void save(PlayerStatsFour playerStatsFour){
        playerFourRepo.save(playerStatsFour);
    }
    public PlayerStatsFour get(Integer PlayerId){
        return  playerFourRepo.findById(PlayerId).get();
    }
    public void delete(Integer PlayerId){
        playerFourRepo.deleteById(PlayerId);
    }
}
