package ir.tamin.hub.domain.enumaration;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Getter
@AllArgsConstructor
public enum ResponseEnum {
    READY_TO_PAY("2000", "برگه پرداخت قابل پرداخت می باشد"),
    LOCKED_SUCCESSFULLY("2001", "برگه پرداخت در فرایند پرداخت قرار گرفت و آماده پرداخت می باشد"),
    ALREADY_LOCKED_BY_YOU("2002", "برگه پرداخت توسط این بانک در فرایند پرداخت قرار گرفته و آماده پرداخت می باشد"),
    SUBMIT_SUCCESSFULLY("2003", "برگه پرداخت با موفقیت ثبت شد"),
    PAYMENT_SUCCESSFULLY("2004", "برگه پرداخت با موفقیت پرداخت شد"),
    CANCELED_SUCCESSFULLY("2005", "برگه پرداخت با موفقیت باطل شد"),
    VERIFYING("2006", "برگه پرداخت در انتظار تاییدیه بانک می باشد"),
    INTERNAL_ERROR("5000", "خطای داخلی"),
    BUSINESS_LOGIC_ERROR("5001", "خطای منطق کسب  و کار"),
    UNAUTHORIZED_CLIENT("5002", "کلاینت نانعتبر است"),
    CLIENT_DEACTIVATED("5003", "کلاینت غیرفعال است"),
    ALREADY_PAYED("5004", "برگه قبلا پرداخت شده است"),
    LOCKED_BY_OTHERS("5005", "برگه پرداخت توسط سایر بانک ها در فرایند پرداخت قرار گرفت"),
    INVALID_BANK("5006", "بانک نامعتبر و یا غیرفعال است"),
    INVALID_BANK_ACCOUNT("5007", "شماره حساب بانکی برای این کلاینت به درستی تنظیم نشده است."),
    EXPIRED("5008", "برگه پرداخت منقضی شده است و قابل پرداخت نمی باشد."),
    CANCELED("5009", "برگه پرداخت باطل شده است."),
    IN_VERIFYING("5010", "برگه پرداخت در انتظار تاییدیه بانک می باشد");

    private final String status;
    private final String message;
}
