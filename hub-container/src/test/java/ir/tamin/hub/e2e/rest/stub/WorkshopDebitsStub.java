package ir.tamin.hub.e2e.rest.stub;

import java.math.BigDecimal;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 7/5/2026 12:54 PM
 * Package: ir.tamin.finance.hub.test.stub
 */

public interface WorkshopDebitsStub {
    String defaultDebitNumber = "0220050008058";
    BigDecimal defaultDebitAmount = BigDecimal.valueOf(513746511982L);

    default void setupWorkshopDebitsStub(String privateCode, String unitCode, String debitNumber, BigDecimal debitAmount) {
        stubFor(get(urlEqualTo("/erequest/api/debit-management/estelam-bedehi/" + privateCode + "/" + unitCode))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"status\": 200,\n" +
                                "  \"family\": \"SUCCESSFUL\",\n" +
                                "  \"reason\": \"OK\",\n" +
                                "  \"traceId\": \"4e3d88c7-0cb6-4c16-baf1-655881906a70\",\n" +
                                "  \"data\": [\n" +
                                "    {\n" +
                                "      \"debitNumber\": \"" + debitNumber + "\",\n" +
                                "      \"workshopCode\": \"" + privateCode + "\",\n" +
                                "      \"debitAmount\": " + debitAmount + ",\n" +
                                "      \"debitRemain\": 513746511982,\n" +
                                "      \"debitCreateDate\": \"14050325\",\n" +
                                "      \"debitStartDate\": \"14040101\",\n" +
                                "      \"debitEndDate\": \"15041229\",\n" +
                                "      \"debitCreateReasonCode\": \"05\",\n" +
                                "      \"debitStepCode\": \"10\",\n" +
                                "      \"debitStatCode\": \"01\",\n" +
                                "      \"debitCreateReasonDesc\": \"محاسبات  رياضي فني\",\n" +
                                "      \"debitStepDesc\": \"اخطاريه  مستند به  ليست\",\n" +
                                "      \"debitStatDesc\": \"محاسبه )اعلام نشده (\",\n" +
                                "      \"bimehAmount\": 401570183639,\n" +
                                "      \"bikariAmount\": 44618909354,\n" +
                                "      \"jarimehAmount\": 67557418989,\n" +
                                "      \"sayerAmount\": 0\n" +
                                "    }\n" +
                                "  ]\n" +
                                "}"
                        )
                )
        );
    }
}
