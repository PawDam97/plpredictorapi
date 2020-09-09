package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.repos.entites.TableFour;

@Repository
public interface TableFourRepository extends JpaRepository<TableFour,Integer> {
}