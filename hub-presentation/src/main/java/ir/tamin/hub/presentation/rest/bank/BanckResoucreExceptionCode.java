package ir.tamin.hub.presentation.rest.bank;


import io.qoop.fault.handler.api.exception.ExceptionCode;

public interface BanckResoucreExceptionCode extends ExceptionCode {
    String BANK_CODE_NOT_Null = "BANK_CODE_NOT_Null";
    String BANK_NAME_NOT_EMPTY = "BANK_NAME_NOT_EMPTY";
    String LIMIT_MAX_MESSAGE = "LIMIT_MAX_MESSAGE";
}
