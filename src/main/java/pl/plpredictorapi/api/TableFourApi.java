package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.TableFour;
import pl.plpredictorapi.services.TableFourServices;

import java.util.List;

@RestController
public class TableFourApi {

    @Autowired
    private TableFourServices services;
    @GetMapping("/TableFour")
    public List<TableFour> list(){
        return services.listAll();
    }
}
