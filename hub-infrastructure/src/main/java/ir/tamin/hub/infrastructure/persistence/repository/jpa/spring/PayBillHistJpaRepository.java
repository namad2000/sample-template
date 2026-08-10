package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import ir.tamin.hub.infrastructure.persistence.entity.PayBillHistEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayBillHistJpaRepository extends JpaRepository<PayBillHistEntity, Long> {

}
