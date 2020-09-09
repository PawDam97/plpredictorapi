package pl.plpredictorapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.repos.entites.TableFive;
import pl.plpredictorapi.repos.entites.TableLive;
import pl.plpredictorapi.services.TableLiveServices;

@RestController
@RequestMapping("/tableLive")
public class TableLiveApi {
    private TableLiveServices tableLiveServices;

    public TableLiveApi(TableLiveServices tableLiveServices){
        this.tableLiveServices = tableLiveServices;
    }
    @GetMapping("/tableLive")
    public Iterable<TableLive> list(){
        return tableLiveServices.list();
    }
}
