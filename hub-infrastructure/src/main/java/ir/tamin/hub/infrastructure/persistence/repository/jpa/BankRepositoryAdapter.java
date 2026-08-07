package ir.tamin.hub.infrastructure.persistence.repository.jpa;


import io.qoop.builder.specification.api.model.FilterWrapper;
import io.qoop.builder.specification.api.model.SortWrapper;
import io.qoop.domain.model.PageFilterData;
import ir.tamin.hub.domain.enumaration.BankEnum;
import ir.tamin.hub.domain.model.Bank;
import ir.tamin.hub.domain.repository.BankRepository;
import ir.tamin.hub.infrastructure.persistence.entity.BankEntity;
import ir.tamin.hub.infrastructure.persistence.mapper.BankMapper;
import ir.tamin.hub.infrastructure.persistence.repository.jpa.spring.BankJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BankRepositoryAdapter implements BankRepository {

    private final BankJpaRepository bankJpaRepository;
    private final BankMapper bankMapper;


    @Override
    public Bank save(Bank domain) {
        BankEntity entity = bankMapper.toTarget(domain);
        entity = bankJpaRepository.save(entity);
        return bankMapper.toSource(entity);
    }

    @Override
    public Optional<Bank> findById(Long id) {
        return bankJpaRepository.findById(id)
                .map(bankMapper::toSource);
    }

    @Override
    public boolean existsById(Long id) {
        return bankJpaRepository.existsById(id);
    }

    @Override
    public void deleteById(Long id) {
        bankJpaRepository.deleteById(id);
    }

    @Override
    public void delete(Bank bank) {
        Long id = bank.getId();
        bankJpaRepository.findById(id)
                .ifPresent(bankJpaRepository::delete);
    }

    @Override
    public PageFilterData<Bank> findAll(FilterWrapper filterWrapper, SortWrapper sortWrapper, Integer start, Integer limit) {
        Page<BankEntity> allUsers = bankJpaRepository.findAll(filterWrapper, sortWrapper, start, limit);
        return bankMapper.toPageFilterData(allUsers);
    }

    @Override
    public boolean existsByCode(BankEnum code) {
        return bankJpaRepository.existsByCode(code);
    }
}
