package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.entites.PlayerStatsThree;

@Repository
public interface PlayerThreeRepository extends JpaRepository<PlayerStatsThree,Integer> {
}
