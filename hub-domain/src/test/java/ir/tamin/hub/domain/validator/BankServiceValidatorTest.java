package ir.tamin.hub.domain.validator;

import io.qoop.fault.handler.api.exception.DomainBusinessException;
import io.qoop.fault.handler.api.exception.DomainException;
import ir.tamin.hub.domain.enumaration.BankEnum;
import ir.tamin.hub.domain.model.Bank;
import ir.tamin.hub.domain.repository.BankRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 8/6/2026 12:08 PM
 * Package: ir.tamin.hub.domain.validator
 */

@ExtendWith(MockitoExtension.class)
class BankServiceValidatorTest {

    @Mock
    private BankRepository bankRepository;

    @InjectMocks
    private BankServiceValidator bankServiceValidator;

    @Test
    @DisplayName("Should throw DomainBusinessException when bank code already exists")
    void validateBankIsUnique_WhenBankExists_ShouldThrowDomainBusinessException() {
        // Given
        BankEnum bankCode = BankEnum.MELLI;
        when(bankRepository.existsByCode(bankCode)).thenReturn(true);

        // When & Then
        assertThrows(
                DomainBusinessException.class,
                () -> bankServiceValidator.validateBankIsUnique(bankCode)
        );

        verify(bankRepository).existsByCode(bankCode);
        verifyNoMoreInteractions(bankRepository);
    }

    @Test
    @DisplayName("Should pass validation when bank code does not exist")
    void validateBankIsUnique_WhenBankDoesNotExist_ShouldNotThrowException() {
        // Given
        BankEnum bankCode = BankEnum.MELLAT;
        when(bankRepository.existsByCode(bankCode)).thenReturn(false);

        // When & Then
        assertDoesNotThrow(() -> bankServiceValidator.validateBankIsUnique(bankCode));

        verify(bankRepository).existsByCode(bankCode);
        verifyNoMoreInteractions(bankRepository);
    }

    @Test
    @DisplayName("Should throw DomainException when bank does not exist by ID")
    void validateBankExistence_WhenBankDoesNotExist_ShouldThrowDomainException() {
        // Given
        Long bankId = 100L;
        Bank bank = mock(Bank.class);
        when(bank.getId()).thenReturn(bankId);
        when(bankRepository.existsById(bankId)).thenReturn(false);

        // When & Then
        assertThrows(
                DomainException.class,
                () -> bankServiceValidator.validateBankExistence(bank)
        );

        verify(bankRepository).existsById(bankId);
        verifyNoMoreInteractions(bankRepository);
    }

    @Test
    @DisplayName("Should pass validation when bank exists by ID")
    void validateBankExistence_WhenBankExists_ShouldNotThrowException() {
        // Given
        Long bankId = 100L;
        Bank bank = mock(Bank.class);
        when(bank.getId()).thenReturn(bankId);
        when(bankRepository.existsById(bankId)).thenReturn(true);

        // When & Then
        assertDoesNotThrow(() -> bankServiceValidator.validateBankExistence(bank));

        verify(bankRepository).existsById(bankId);
        verifyNoMoreInteractions(bankRepository);
    }

    @Test
    @DisplayName("Should throw DomainValidationException when bank does not exist by ID")
    void validateBankExistence_WhenBankDoesNotExist_ShouldThrowException() {
        // Given
        Long bankId = 1L;
        when(bankRepository.existsById(bankId)).thenReturn(false);

        // When & Then
        assertThrows(
                DomainException.class,
                () -> bankServiceValidator.validateBankExistence(bankId)
        );

        verify(bankRepository).existsById(bankId);
        verifyNoMoreInteractions(bankRepository);
    }

    @Test
    @DisplayName("Should pass validation when bank exists by ID")
    void validateBankExistence_WhenBankExists_ShouldNotThrowExceptionWithId() {
        // Given
        Long bankId = 1L;
        when(bankRepository.existsById(bankId)).thenReturn(true);

        // When & Then
        assertDoesNotThrow(
                () -> bankServiceValidator.validateBankExistence(bankId)
        );

        verify(bankRepository).existsById(bankId);
        verifyNoMoreInteractions(bankRepository);
    }
}