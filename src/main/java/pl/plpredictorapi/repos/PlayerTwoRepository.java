package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.repos.entites.PlayerStatsTwo;

@Repository
public interface PlayerTwoRepository extends JpaRepository<PlayerStatsTwo,Integer> {
}
