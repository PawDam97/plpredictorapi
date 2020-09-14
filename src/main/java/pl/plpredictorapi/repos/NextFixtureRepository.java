package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.repos.entites.NextFixture;

import java.util.List;

@Repository
public interface NextFixtureRepository extends JpaRepository<NextFixture,Integer> {
    @Query("SELECT t FROM NextFixture t WHERE t.HomeTeam = :name")
    List<NextFixture> getByName(@Param("name") String name);
}
