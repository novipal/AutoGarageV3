package nl.novi.autogaragev2.repository;

import nl.novi.autogaragev2.model.Repair;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairRepository extends JpaRepository<Repair, Long> {
}
