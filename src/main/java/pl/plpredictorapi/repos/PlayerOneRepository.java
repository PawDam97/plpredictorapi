package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.entites.PlayerStatsOne;

@Repository
public interface PlayerOneRepository extends JpaRepository<PlayerStatsOne,Integer> {
}
