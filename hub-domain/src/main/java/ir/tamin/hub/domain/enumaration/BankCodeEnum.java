package ir.tamin.hub.domain.enumaration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

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
    PC_POS("PC_POS", "پرداخت از طریق دستگاه کارت خوان"),
    CREDIT("CREDIT", "پرداخت از اعتبار", false, false);

    @Getter
    private final String code;

    @Getter
    private final String name;
    private final boolean hasAccountNumber;
    private final boolean shouldVerify;

    BankCodeEnum(String code, String name) {
        this(code, name, true, true);
    }

    public boolean hasAccountNumber() {
        return hasAccountNumber;
    }

    public boolean shouldVerify() {
        return shouldVerify;
    }
}
