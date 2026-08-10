package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import ir.tamin.hub.infrastructure.persistence.entity.PayMergeItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayMergeItemJpaRepository extends JpaRepository<PayMergeItemEntity, Long> {

}
