package nl.novi.autogaragev2.repository;

import nl.novi.autogaragev2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
