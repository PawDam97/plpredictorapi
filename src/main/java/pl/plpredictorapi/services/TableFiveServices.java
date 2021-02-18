package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.TableFiveRepository;
import pl.plpredictorapi.entites.TableFive;

import java.util.List;

@Service
public class TableFiveServices {
    @Autowired
    private TableFiveRepository tableFiveRepo;

    public List<TableFive> listAll() {
        return tableFiveRepo.findAll();
    }
    public void save(TableFive tableFive){
        tableFiveRepo.save(tableFive);
    }
    public TableFive get(Integer Id){
        return  tableFiveRepo.findById(Id).get();
    }
    public void delete(Integer Id){
        tableFiveRepo.deleteById(Id);
    }
}
