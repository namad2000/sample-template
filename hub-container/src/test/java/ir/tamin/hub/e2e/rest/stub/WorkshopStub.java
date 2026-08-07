package ir.tamin.hub.e2e.rest.stub;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 7/5/2026 12:54 PM
 * Package: ir.tamin.finance.hub.test.stub
 */

public interface WorkshopStub {
    String defaultBranchTitle = "شعبه مرکزی تهران";
    String defaultWorkshopName = "کارگاه توليدي صنعتي البرز";

    default void setupGetWorkshopsStub(String nationalCode, String branchCode, String workshopId) {
        stubFor(get(urlEqualTo("/api/erequest-workshops-services/employer/get-all-workshops/" + nationalCode))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"status\": 200,\n" +
                                "  \"family\": \"SUCCESSFUL\",\n" +
                                "  \"reason\": \"OK\",\n" +
                                "  \"traceId\": \"9477abb1-9aad-4d2e-b5e4-c874baa5ebac\",\n" +
                                "  \"data\": {\n" +
                                "    \"total\": 1,\n" +
                                "    \"list\": [\n" +
                                "      {\n" +
                                "        \"workshopId\": \"" + workshopId + "\",\n" +
                                "        \"branchCode\": \"" + branchCode + "\",\n" +
                                "        \"branchTitle\": \"" + defaultBranchTitle + "\",\n" +
                                "        \"workshopName\": \"" + defaultWorkshopName + "\",\n" +
                                "        \"workshopApproveDate\": \"1402/08/15\",\n" +
                                "        \"actitvityCode\": \"ACT-7721\"\n" +
                                "      }\n" +
                                "    ]\n" +
                                "  }\n" +
                                "}")
                )
        );
    }
}
