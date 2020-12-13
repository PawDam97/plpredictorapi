package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.repos.entites.LastFixture;

import java.util.List;

@Repository
public interface LastFixtureRepository extends JpaRepository<LastFixture,Integer> {
    @Query("SELECT t FROM LastFixture t WHERE t.fixtureId = :fixture_id")
    List<LastFixture> getByFixtureId(@Param("fixture_id") Integer fixtureId);
}
