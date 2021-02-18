package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.entites.TableTwo;

@Repository
public interface TableTwoRepository extends JpaRepository<TableTwo,Integer> {
}
