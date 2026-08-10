package ir.tamin.hub.infrastructure.persistence.repository.jpa.spring;

import ir.tamin.hub.infrastructure.persistence.entity.CfgBankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountJpaRepository extends JpaRepository<CfgBankAccountEntity, Long> {

}
