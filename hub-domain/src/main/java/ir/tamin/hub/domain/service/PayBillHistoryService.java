package ir.tamin.hub.domain.service;

import io.qoop.filter.bean.api.DomainService;
import ir.tamin.hub.domain.repository.PayBillHistoryRepository;
import lombok.RequiredArgsConstructor;

/** جدول تاریخچه معمولاً read-mostly است؛ ثبت آن اغلب توسط trigger/AuditListener انجام می‌شود. */
@DomainService
@RequiredArgsConstructor
public class PayBillHistoryService  {

    private final PayBillHistoryRepository payBillHistoryRepository;

  }
