package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import io.qoop.jpa.persistence.specification.JpaSpecificationBuilder;
import ir.tamin.hub.domain.enumaration.BankEnum;
import ir.tamin.hub.infrastructure.persistence.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankJpaRepository extends JpaRepository<BankEntity, Long>, JpaSpecificationBuilder<BankEntity, Long> {
    boolean existsByCode(BankEnum code);
}
