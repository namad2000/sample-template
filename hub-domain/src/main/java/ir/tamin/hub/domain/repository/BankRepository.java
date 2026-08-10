package ir.tamin.hub.domain.repository;

import io.qoop.domain.repository.CrudRepository;
import io.qoop.domain.repository.SpecificationRepository;
import ir.tamin.hub.domain.enumaration.BankCodeEnum;
import ir.tamin.hub.domain.model.Bank;

public interface BankRepository extends CrudRepository<Bank, Long>, SpecificationRepository<Bank> {
    boolean existsByCode(BankCodeEnum code);
}
