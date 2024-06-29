package my.sahira.testspringboot.repository;

import my.sahira.testspringboot.model.Population;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PopulationRepository extends JpaRepository<Population, Long> {

}
