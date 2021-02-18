package pl.plpredictorapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.plpredictorapi.entites.TableLive;
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

    @GetMapping("/tableLive/{Id}")
    public Iterable<TableLive> getByApiId (@PathVariable Integer Id){
       return tableLiveServices.getByApiId(Id);
    }

    @GetMapping("/save")
	public void savePremiershipTable(){
    	tableLiveServices.savePremiershipTable();
    }

    
}
