package ir.tamin.hub.domain.enumaration;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Getter
@AllArgsConstructor
public enum PaymentStatusEnum {
    START_TRANSACTION((short) -1, "شروع تراکنش"),
    SUCCESS((short) 0, "تراکنش با موفقیت انجام پذیرفت"),
    CARD_SWIPED((short) 1, "کارت کشیده شد"),
    AMOUNT_TOO_LOW((short) 2, "مبلغ تراکنش نمی‌تواند از حداقل مبلغ کوچکتر باشد"),
    NO_DEVICE_CONNECTION((short) 3, "عدم ارتباط با دستگاه"),
    INVALID_INFO((short) 4, "اطلاعات نامعتبر"),
    ZERO_AMOUNT((short) 5, "صفر ریال بدهی"),
    DATA_RECEIVE_ERROR((short) 6, "خطا در دریافت اطلاعات"),
    NO_ACCESS((short) 7, "عدم دسترسی به این عملیات"),
    TRANSACTION_NOT_FOUND((short) 8, "تراکنش یافت نشد"),
    INVALID_TERMINAL((short) 9, "ترمینال نامعتبر"),
    RESPONSE_ERROR((short) 10, "خطا در پاسخ"),
    INVALID_TRANSACTION((short) 12, "تراکنش نامعتبر"),
    INVALID_AMOUNT((short) 13, "مبلغ نامعتبر"),
    ASSIGN_ERROR((short) 14, "خطا در مقداردهی"),
    INVALID_RESPONSE((short) 20, "پاسخ نامعتبر"),
    TRANSACTION_ERROR((short) 26, "خطا در تراکنش"),
    ALREADY_PAID((short) 27, "این قبض قبلا پرداخت شده است"),
    NOT_PAYABLE((short) 28, "غیرقابل پرداخت"),
    DATA_FORMAT_ERROR((short) 30, "خطا در قالب اطلاعات"),
    CARD_EXPIRED((short) 33, "تاریخ انقضای کارت سپری شده است"),
    SECURITY_WARNING((short) 34, "اخطار امنیتی"),
    WRONG_PIN_LIMIT((short) 38, "تعداد دفعات ورود رمز غلط بیش از حد مجاز است"),
    INSUFFICIENT_BALANCE((short) 51, "موجودی کافی نمی‌باشد"),
    INVALID_PIN((short) 55, "رمز کارت نامعتبر است"),
    NOT_AUTHORIZED_BY_HOLDER((short) 57, "انجام تراکنش مربوطه توسط دارنده کارت مجاز نمی‌باشد"),
    NOT_AUTHORIZED_BY_TERMINAL((short) 58, "انجام تراکنش مربوطه توسط پایانه انجام‌دهنده مجاز نمی‌باشد"),
    AMOUNT_EXCEEDS_LIMIT((short) 61, "مبلغ تراکنش بیش از حد مجاز می‌باشد"),
    NO_RESPONSE_IN_TIME((short) 68, "عدم دریافت پاسخ در زمان مناسب"),
    WRONG_PIN_LIMIT_ALT((short) 69, "تعداد دفعات ورود رمز غلط بیش از حد مجاز است"),
    CARD_INACTIVE((short) 78, "کارت غیرفعال می‌باشد"),
    NO_RESPONSE_FROM_ISSUER1((short) 80, "عدم پاسخ از سوی صادرکننده کارت"),
    NO_RESPONSE_FROM_ISSUER2((short) 84, "عدم پاسخ از سوی صادرکننده کارت"),
    NO_RESPONSE_FROM_ISSUER3((short) 91, "عدم پاسخ از سوی صادرکننده کارت"),
    AMOUNTS_DIFFERENT((short) 92, "مبالغ متفاوت"),
    UNKNOWN_ERROR((short) 96, "خطای نامشخص"),
    NO_CONNECTION_TO_CENTER((short) 97, "عدم ارتباط با مرکز"),
    CANCELLED_BY_USER((short) 98, "لغو عملیات توسط کاربر"),
    NO_RESPONSE_IN_TIME_CARDREADER((short) 99, "عدم دریافت پاسخ در زمان مناسب در کارتخوان"),
    INVALID_ACCOUNT((short) 100, "وضعیت حساب نامعتبر");

    private final short code;
    private final String description;

    private static final Map<Short, PaymentStatusEnum> MAP = new HashMap<>();

    static {
        for (PaymentStatusEnum status : PaymentStatusEnum.values()) {
            MAP.put(status.code, status);
        }
    }

    PaymentStatusEnum(Short code, String description) {
        this.code = code;
        this.description = description;
    }

    public static PaymentStatusEnum fromCode(Short code) {
        if (code == null) {
            return null;
        }

        return MAP.get(code);
    }
}
