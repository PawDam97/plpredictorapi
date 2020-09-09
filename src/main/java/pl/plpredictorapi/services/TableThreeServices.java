package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.TableThreeRepository;
import pl.plpredictorapi.repos.entites.TableThree;

import java.util.List;

@Service
public class TableThreeServices {

    @Autowired
    private TableThreeRepository tableThreeRepo;

    public List<TableThree> listAll() {
        return tableThreeRepo.findAll();
    }
    public void save(TableThree tableThree){
        tableThreeRepo.save(tableThree);
    }
    public TableThree get(Integer Id){
        return  tableThreeRepo.findById(Id).get();
    }
    public void delete(Integer Id){
        tableThreeRepo.deleteById(Id);
    }

}
