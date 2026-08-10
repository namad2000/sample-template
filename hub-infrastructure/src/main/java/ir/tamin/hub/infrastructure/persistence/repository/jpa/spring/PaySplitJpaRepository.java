package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import ir.tamin.hub.infrastructure.persistence.entity.PaySplitEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaySplitJpaRepository extends JpaRepository<PaySplitEntity, Long> {

}
