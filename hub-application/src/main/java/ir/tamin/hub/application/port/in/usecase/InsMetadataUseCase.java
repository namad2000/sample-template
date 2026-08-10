package ir.tamin.hub.application.port.in.usecase;

import io.qoop.filter.bean.api.UseCaseService;
import ir.tamin.hub.domain.repository.InsMetadataRepository;
import ir.tamin.hub.domain.repository.MetadataLegalRepository;
import ir.tamin.hub.domain.repository.MetadataRealRepository;
import lombok.RequiredArgsConstructor;
import java.util.Optional;

/**
 * هماهنگ‌کننده‌ی ثبت شخص حقیقی/حقوقی مرتبط با یک برگه پرداخت.
 * ترتیب: اول TB_INS_METADATA ذخیره می‌شود تا ID تولید شود، سپس همان ID
 * روی رکورد جزئیات (Real/Legal) ست می‌شود — چون رابطه از نوع shared PK است.
 */
@UseCaseService
@RequiredArgsConstructor
public class InsMetadataUseCase {

    private final InsMetadataRepository insMetadataRepository;
    private final MetadataRealRepository metadataRealRepository;
    private final MetadataLegalRepository metadataLegalRepository;


}
