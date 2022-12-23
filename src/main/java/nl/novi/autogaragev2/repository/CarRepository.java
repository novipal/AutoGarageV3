package nl.novi.autogaragev2.repository;

import nl.novi.autogaragev2.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
