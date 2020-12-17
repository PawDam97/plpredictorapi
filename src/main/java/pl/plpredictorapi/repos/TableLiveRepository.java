package pl.plpredictorapi.repos;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.plpredictorapi.repos.entites.TableLive;

@Repository
public interface TableLiveRepository extends JpaRepository<TableLive,Integer> {
	public List<TableLive> findByApiId(Integer apiId);
	@Query("SELECT t FROM TableLive t WHERE t.ClubName = :name")
	List<TableLive> getByName(@Param("name") String name);
}
