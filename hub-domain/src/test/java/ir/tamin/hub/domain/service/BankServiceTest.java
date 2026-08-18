package ir.tamin.hub.domain.service;

import io.qoop.builder.specification.api.model.FilterWrapper;
import io.qoop.builder.specification.api.model.SortWrapper;
import io.qoop.domain.model.PageFilterData;
import io.qoop.fault.handler.api.exception.DomainException;
import io.qoop.logs.DomainLogger;
import ir.tamin.hub.domain.enumaration.BankCodeEnum;
import ir.tamin.hub.domain.model.Bank;
import ir.tamin.hub.domain.repository.BankRepository;
import ir.tamin.hub.domain.validator.BankServiceValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 8/6/2026 5:19 PM
 * Package: ir.tamin.hub.domain.service
 */


@ExtendWith(MockitoExtension.class)
class BankServiceTest {

    @Mock
    private BankRepository bankRepository;

    @Mock
    private DomainLogger logger;

    @Mock
    private BankServiceValidator bankServiceValidator;

    @InjectMocks
    private BankService bankService;

    // ==================== create ====================

    @Test
    @DisplayName("Should validate uniqueness and create bank successfully")
    void create_ShouldValidateUniquenessAndSaveBank() {
        // Given
        BankCodeEnum code = BankCodeEnum.MELLI;
        String name = "Melli Bank";
        boolean active = true;

        Bank expectedBank = Bank.builder()
                .code(code)
                .name(name)
                .active(active)
                .build();

        doNothing().when(bankServiceValidator).validateBankIsUnique(code);
        when(bankRepository.save(any(Bank.class))).thenReturn(expectedBank);

        // When
        Bank result = bankService.create(code, name, active);

        // Then
        assertNotNull(result);
        assertEquals(code, result.getCode());
        assertEquals(name, result.getName());
        assertTrue(result.isActive());

        verify(bankServiceValidator).validateBankIsUnique(code);
        verify(bankRepository).save(any(Bank.class));
        verifyNoMoreInteractions(bankRepository, bankServiceValidator);
    }

    // ==================== update ====================

    @Test
    @DisplayName("Should validate existence, uniqueness, and update bank successfully")
    void update_ShouldValidateAndSaveBank() {
        // Given
        Bank bankToUpdate = Bank.builder()
                .code(BankCodeEnum.MELLAT)
                .name("Mellat Bank")
                .active(true)
                .build();

        doNothing().when(bankServiceValidator).validateBankExistence(bankToUpdate);
        doNothing().when(bankServiceValidator).validateBankIsUnique(bankToUpdate.getCode());
        when(bankRepository.save(bankToUpdate)).thenReturn(bankToUpdate);

        // When
        Bank result = bankService.update(bankToUpdate);

        // Then
        assertNotNull(result);
        assertEquals(bankToUpdate, result);

        verify(bankServiceValidator).validateBankExistence(bankToUpdate);
        verify(bankServiceValidator).validateBankIsUnique(bankToUpdate.getCode());
        verify(bankRepository).save(bankToUpdate);
        verifyNoMoreInteractions(bankRepository, bankServiceValidator);
    }

    // ==================== getById ====================

    @Test
    @DisplayName("Should return bank and validate active status when bank exists")
    void getById_WhenBankExists_ShouldReturnBank() {
        // Given
        Long bankId = 1L;
        Bank bank = mock(Bank.class);

        when(bankRepository.findById(bankId)).thenReturn(Optional.of(bank));
        doNothing().when(bank).validateIdIsActive();

        // When
        Bank result = bankService.getById(bankId);

        // Then
        assertNotNull(result);
        assertEquals(bank, result);

        verify(bankRepository).findById(bankId);
        verify(bank).validateIdIsActive();
        verifyNoMoreInteractions(bankRepository, bankServiceValidator);
    }

    @Test
    @DisplayName("Should throw DomainBusinessException when bank does not exist")
    void getById_WhenBankDoesNotExist_ShouldThrowDomainBusinessException() {
        // Given
        Long bankId = 99L;
        when(bankRepository.findById(bankId)).thenReturn(Optional.empty());

        // When & Then
        assertThrows(
                DomainException.class,
                () -> bankService.getById(bankId)
        );

        verify(bankRepository).findById(bankId);
        verifyNoMoreInteractions(bankRepository);
        verifyNoInteractions(bankServiceValidator);
    }

    // ==================== deleteById ====================

    @Test
    @DisplayName("Should validate existence and delete bank by ID successfully")
    void deleteById_ShouldValidateExistenceAndDelete() {
        // Given
        Long bankId = 1L;
        doNothing().when(bankServiceValidator).validateBankExistence(bankId);
        doNothing().when(bankRepository).deleteById(bankId);

        // When
        assertDoesNotThrow(() -> bankService.deleteById(bankId));

        // Then
        verify(bankServiceValidator).validateBankExistence(bankId);
        verify(bankRepository).deleteById(bankId);
        verifyNoMoreInteractions(bankRepository, bankServiceValidator);
    }

    // ==================== getAll ====================

    @Test
    @DisplayName("Should call repository findAll and return page filter data")
    void getAll_ShouldReturnPageFilterData() {
        // Given
        FilterWrapper filterWrapper = mock(FilterWrapper.class);
        SortWrapper sortWrapper = mock(SortWrapper.class);
        Integer start = 0;
        Integer limit = 10;

        @SuppressWarnings("unchecked")
        PageFilterData<Bank> expectedPageData = mock(PageFilterData.class);

        when(bankRepository.findAll(filterWrapper, sortWrapper, start, limit)).thenReturn(expectedPageData);

        // When
        PageFilterData<Bank> result = bankService.getAll(filterWrapper, sortWrapper, start, limit);

        // Then
        assertNotNull(result);
        assertEquals(expectedPageData, result);

        verify(bankRepository).findAll(filterWrapper, sortWrapper, start, limit);
        verifyNoMoreInteractions(bankRepository);
        verifyNoInteractions(bankServiceValidator);
    }
}