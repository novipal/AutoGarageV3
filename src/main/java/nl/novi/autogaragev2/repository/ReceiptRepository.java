package nl.novi.autogaragev2.repository;

import nl.novi.autogaragev2.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}
