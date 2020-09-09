package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.repos.entites.TeamStrength;

@Repository
public interface TeamStrengthRepository extends JpaRepository<TeamStrength,Integer> {
}
