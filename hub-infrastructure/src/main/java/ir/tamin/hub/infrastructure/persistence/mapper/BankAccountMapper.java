package ir.tamin.hub.infrastructure.persistence.mapper;


import io.qoop.mapper.core.CommonsMapperConfig;
import io.qoop.mapper.core.mapper.PageMapper;
import ir.tamin.hub.domain.model.BankAccount;
import ir.tamin.hub.infrastructure.persistence.entity.CfgBankAccountEntity;
import org.mapstruct.Mapper;

@Mapper(config = CommonsMapperConfig.class)
public interface BankAccountMapper extends PageMapper<BankAccount, CfgBankAccountEntity> {
}
