package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.TableTwoRepository;
import pl.plpredictorapi.entites.TableTwo;

import java.util.List;

@Service
public class TableTwoServices {

    @Autowired
    private TableTwoRepository tableTwoRepo;

    public List<TableTwo> listAll() {
        return tableTwoRepo.findAll();
    }
    public void save(TableTwo tableTwo){
        tableTwoRepo.save(tableTwo);
    }
    public TableTwo get(Integer Id){
        return  tableTwoRepo.findById(Id).get();
    }
    public void delete(Integer Id){
        tableTwoRepo.deleteById(Id);
    }

}
