package ir.tamin.hub.domain.repository;

import io.qoop.domain.repository.CrudRepository;
import ir.tamin.hub.domain.model.BankAccount;

import java.util.List;
import java.util.Optional;

public interface BankAccountRepository extends CrudRepository<BankAccount, Long> {

}
