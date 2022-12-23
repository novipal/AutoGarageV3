package nl.novi.autogaragev2.repository;

import nl.novi.autogaragev2.model.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action, Long> {
}
