package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.TableFourRepository;
import pl.plpredictorapi.entites.TableFour;

import java.util.List;

@Service
public class TableFourServices {

    @Autowired
    private TableFourRepository tableFourRepo;

    public List<TableFour> listAll() {
        return tableFourRepo.findAll();
    }
    public void save(TableFour tableFour){
        tableFourRepo.save(tableFour);
    }
    public TableFour get(Integer Id){
        return  tableFourRepo.findById(Id).get();
    }
    public void delete(Integer Id){
        tableFourRepo.deleteById(Id);
    }

}
