package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.PayBankResponse;
import ir.tamin.hub.infrastructure.persistence.entity.PayBankResponseEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface PayBankResponseMapper extends PageMapper<PayBankResponse, PayBankResponseEntity> {
}
