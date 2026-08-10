package ir.tamin.hub.domain.repository;

import io.qoop.domain.repository.CrudRepository;
import ir.tamin.hub.domain.model.PaymentBill;

import java.util.List;
import java.util.Optional;

public interface PaymentBillRepository extends CrudRepository<PaymentBill, Long> {

}
