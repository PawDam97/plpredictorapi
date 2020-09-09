package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.repos.entites.TableLive;

@Repository
public interface TableLiveRepository extends JpaRepository<TableLive,Integer> {
}
