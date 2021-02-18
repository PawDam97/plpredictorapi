package pl.plpredictorapi.repos;

import pl.plpredictorapi.entites.TableOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableOneRepository extends JpaRepository<TableOne,Integer> {
}
