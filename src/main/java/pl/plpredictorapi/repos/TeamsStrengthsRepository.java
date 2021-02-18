package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.entites.TeamsStrengths;

@Repository
public interface TeamsStrengthsRepository extends JpaRepository<TeamsStrengths,Integer> {
}
