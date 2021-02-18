package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.entites.TableThree;

@Repository
public interface TableThreeRepository extends JpaRepository<TableThree,Integer> {
}