package ir.tamin.hub.domain.enumaration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Getter
@AllArgsConstructor
public enum BankCodeEnum {
    REFAH("REFAH", "بانک رفاه"),
    MELLI("MELLI", "بانک ملی ایران"),
    MELLAT("MELLAT", "بانک ملت"),
    TEJARAT("TEJARAT", "بانک تجارت"),
    SADERAT("SADERAT", "بانک صادرات"),
    KESHAVARZI("KESHAVARZI", "بانک کشاورزی"),
    SEPAH("SEPAH", "بانک سپه"),
    MASKAN("MASKAN", "بانک مسکن"),
    POSTBANK("POSTBANK", "پست بانک"),
    SARMAYEH("SARMAYEH", "بانک سرمایه"),
    TFH("TFH", "درگاه سازمان تامین اجتماعی"),
    PC_POS("PC_POS", "پرداخت از طریق دستگاه کارت خوان");

    private final String code;
    private final String name;
}
