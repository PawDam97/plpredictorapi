package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.TableThree;
import pl.plpredictorapi.services.TableThreeServices;

import java.util.List;

@RestController
public class TableThreeApi {

    @Autowired
    private TableThreeServices services;
    @GetMapping("/TableThree")
    public List<TableThree> list(){
        return services.listAll();
    }
}
