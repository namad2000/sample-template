package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import ir.tamin.hub.infrastructure.persistence.entity.PayBankResponseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayBankResponseJpaRepository extends JpaRepository<PayBankResponseEntity, Long> {

}
