package ir.tamin.hub.presentation.rest.bank;


import io.qoop.fault.handler.api.exception.ExceptionCode;

public interface BanckResoucreExceptionCode extends ExceptionCode {
    String BANK_CODE_NOT_Null = "BANK_RESOURCE_01";
    String BANK_NAME_NOT_EMPTY = "BANK_RESOURCE_02";
}
