package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.TableOne;
import pl.plpredictorapi.services.TableOneServices;

import java.util.List;

@RestController
public class TableOneApi {

@Autowired
    private TableOneServices services;
@GetMapping("/TableOne")
public List<TableOne> list(){
    return services.listAll();
}
}
