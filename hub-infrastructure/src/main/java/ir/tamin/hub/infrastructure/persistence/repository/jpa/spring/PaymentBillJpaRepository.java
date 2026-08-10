package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import ir.tamin.hub.infrastructure.persistence.entity.PaymentBillEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentBillJpaRepository extends JpaRepository<PaymentBillEntity, Long> {

}
