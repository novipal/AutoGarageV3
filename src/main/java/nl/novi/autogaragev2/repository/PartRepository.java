package nl.novi.autogaragev2.repository;

import nl.novi.autogaragev2.model.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepository extends JpaRepository<Part, Long> {
}
