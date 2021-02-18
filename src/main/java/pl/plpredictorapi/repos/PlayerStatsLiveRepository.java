package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.plpredictorapi.entites.PlayerStatsLive;

import java.util.List;

public interface PlayerStatsLiveRepository extends JpaRepository<PlayerStatsLive,Integer> {
    @Query("SELECT t FROM PlayerStatsLive t WHERE t.PlayerId = :PlayerId")
    List<PlayerStatsLive> getById(@Param("PlayerId") Integer PlayerId);
}
