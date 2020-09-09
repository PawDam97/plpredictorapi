package pl.plpredictorapi.services;

import org.springframework.stereotype.Service;
import pl.plpredictorapi.repos.TableLiveRepository;
import pl.plpredictorapi.repos.entites.TableLive;

@Service
public class TableLiveServices {
private TableLiveRepository tableLiveRepository;
    public TableLiveServices(TableLiveRepository tableLiveRepository) {
        this.tableLiveRepository = tableLiveRepository;
    }

    public Iterable<TableLive> list() {
        return tableLiveRepository.findAll();
    }

    public Iterable<TableLive> save(List<TableLive> tableLiveList) {
        return tableLiveRepository.save(tableLiveList);
    }
}
