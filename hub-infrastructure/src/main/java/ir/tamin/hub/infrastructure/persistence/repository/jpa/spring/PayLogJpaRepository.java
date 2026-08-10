package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import ir.tamin.hub.infrastructure.persistence.entity.PayLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayLogJpaRepository extends JpaRepository<PayLogEntity, Long> {
}
