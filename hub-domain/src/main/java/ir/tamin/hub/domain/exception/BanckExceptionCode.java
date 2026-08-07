package ir.tamin.hub.domain.exception;


import io.qoop.fault.handler.api.exception.ExceptionCode;

public interface BanckExceptionCode extends ExceptionCode {
    String BANK_NOT_FOUND = "BANK_01";
    String BANK_IS_INACTIVE = "BANK_02";
    String BANK_DUPLICATED = "BANK_03";
}
