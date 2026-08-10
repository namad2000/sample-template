package ir.tamin.hub.domain.service;

import io.qoop.filter.bean.api.DomainService;

import ir.tamin.hub.domain.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;


import java.util.List;

@DomainService
@RequiredArgsConstructor
public class BankAccountService  {

    private final BankAccountRepository bankAccountRepository;

}
