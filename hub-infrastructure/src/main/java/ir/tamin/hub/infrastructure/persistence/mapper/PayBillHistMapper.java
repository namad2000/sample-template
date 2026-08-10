package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.PayBillHistory;
import ir.tamin.hub.infrastructure.persistence.entity.PayBillHistEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface PayBillHistMapper extends PageMapper<PayBillHistory, PayBillHistEntity> {
}
