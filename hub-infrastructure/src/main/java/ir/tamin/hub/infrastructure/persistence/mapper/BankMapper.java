package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.Bank;
import ir.tamin.hub.infrastructure.persistence.entity.BankEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface BankMapper extends PageMapper<Bank, BankEntity> {
}
