package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.entites.TableFive;

@Repository
public interface TableFiveRepository extends JpaRepository<TableFive,Integer> {
}
