package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.PaymentBill;
import ir.tamin.hub.infrastructure.persistence.entity.PaymentBillEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface PaymentBillMapper extends PageMapper<PaymentBill, PaymentBillEntity> {
}
