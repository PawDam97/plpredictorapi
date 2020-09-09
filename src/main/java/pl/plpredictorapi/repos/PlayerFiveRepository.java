package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.repos.entites.PlayerStatsFive;

@Repository
public interface PlayerFiveRepository extends JpaRepository<PlayerStatsFive,Integer> {
}
