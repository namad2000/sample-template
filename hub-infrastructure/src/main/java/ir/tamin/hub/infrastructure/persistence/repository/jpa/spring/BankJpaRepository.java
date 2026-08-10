package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import io.qoop.jpa.persistence.specification.JpaSpecificationBuilder;
import ir.tamin.hub.domain.enumaration.BankCodeEnum;
import ir.tamin.hub.infrastructure.persistence.entity.CfgBankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankJpaRepository extends JpaRepository<CfgBankEntity, Long>, JpaSpecificationBuilder<CfgBankEntity, Long> {
    boolean existsByCode(BankCodeEnum code);
}
