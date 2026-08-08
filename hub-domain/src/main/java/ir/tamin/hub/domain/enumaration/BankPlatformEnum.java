package ir.tamin.hub.domain.enumaration;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Getter
@AllArgsConstructor
public enum BankPlatformEnum {
    COUNTER("COUNTER", "باجه"),
    ATM("ATM", "دستگاه خود پرداز"),
    POS("POS", "دستگاه کارت خوان"),
    MOBILE_BANK("MOBILE_BANK", "همراه بانک"),
    WEB_BANK("WEB_BANK", "اینترنت بانک"),
    TELEPHONE_BANK("TELEPHONE_BANK", "تلفن بانک"),
    SEKEH("SEKEH", "سکه"),
    MEGA_BANK("MEGA_BANK", "مگا بانک"),
    ONLINE("ONLINE", "آنلاین"),
    OTHER("OTHER", "سایر"),
    PC_POS("PC_POS", "دستگاه کارتخوان شعبه");

    private final String code;
    private final String name;
}
