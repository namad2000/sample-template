package ir.tamin.hub.domain.enumaration;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Getter
@AllArgsConstructor
public enum PaymentBillStatusEnum {
    NOT_PAYED("NOT_PAYED", "پرداخت نشده"),
    VERIFYING("VERIFYING", " در انتظار تایید پرداخت"),
    PAYED("PAYED", "پرداخت شده"),
    CANCELED("CANCELED", "ابطال شده"),
    SEND_TO_GL("SEND_TO_GL", "ارسال به حسابداری");

    private final String code;
    private final String name;
}

