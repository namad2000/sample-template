package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.repository.PayBillHistoryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

/** جدول تاریخچه معمولاً read-mostly است؛ ثبت آن اغلب توسط trigger/AuditListener انجام می‌شود. */
@UseCaseService
@RequiredArgsConstructor
public class PayBillHistoryUseCase  {

    private final PayBillHistoryRepository payBillHistoryRepository;

}
