package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.repos.entites.PlayerStatsFour;

@Repository
public interface PlayerFourRepository extends JpaRepository<PlayerStatsFour,Integer> {
}
