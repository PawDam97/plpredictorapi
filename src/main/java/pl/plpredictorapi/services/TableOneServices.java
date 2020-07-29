package pl.plpredictorapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.TableOneRepository;
import pl.plpredictorapi.repos.entites.TableOne;

import java.util.List;

@Service
public class TableOneServices {

@Autowired
    private TableOneRepository tableOneRepo;

public List<TableOne> listAll() {
    return tableOneRepo.findAll();
}
public void save(TableOne tableOne){
    tableOneRepo.save(tableOne);
}
public TableOne get(Integer Position){
return  tableOneRepo.findById(Position).get();
}
public void delete(Integer Position){
    tableOneRepo.deleteById(Position);
}

}
