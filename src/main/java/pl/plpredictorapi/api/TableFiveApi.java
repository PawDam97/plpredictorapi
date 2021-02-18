package pl.plpredictorapi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.entites.TableFive;
import pl.plpredictorapi.services.TableFiveServices;

import java.util.List;

@RestController
public class TableFiveApi {
    @Autowired
    private TableFiveServices services;
    @GetMapping("/TableFive")
    public List<TableFive> list(){
        return services.listAll();
    }
}
