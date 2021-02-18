package pl.plpredictorapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import pl.plpredictorapi.entites.Weights;


@Repository
public interface WeightsRepository extends JpaRepository<Weights,Integer> {
}
