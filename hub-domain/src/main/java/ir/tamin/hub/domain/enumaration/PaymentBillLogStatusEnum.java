package ir.tamin.hub.domain.enumaration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Getter
@AllArgsConstructor
public enum PaymentBillLogStatusEnum {
    CREATED("CREATED", "ثبت اولیه"),
    BANK_INQUIRY("BANK_INQUIRY", "استعلام بانک"),
    LOCK("LOCK", "قفل موفق"),
    BANK_INQUIRY_AND_LOCK("BANK_INQUIRY_AND_LOCK", "استعلام بانک و قفل موفق"),
    VERIFYING("VERIFYING", "تاییدیه پرداخت باتک"),
    PAYED_SUCCESSFUL("PAYED_SUCCESSFUL", "پرداخت موفق"),
    CANCELED("CANCELED", "ابطال");

    private final String code;
    private final String name;
}
