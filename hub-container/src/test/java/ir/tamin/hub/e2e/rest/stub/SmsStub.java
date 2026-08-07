package ir.tamin.hub.e2e.rest.stub;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 7/5/2026 12:54 PM
 * Package: ir.tamin.finance.hub.test.stub
 */

public interface SmsStub {
    default void setupSendSmsStub() {
        stubFor(post(urlEqualTo("/api/messages"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"status\": 202,\n" +
                                "  \"family\": \"SUCCESSFUL\",\n" +
                                "  \"reason\": \"Accepted\",\n" +
                                "  \"traceId\": \"2f1591fd-aeba-48e5-a823-22ab2a49e8d1\",\n" +
                                "  \"data\": {\n" +
                                "    \"id\": 3160670800,\n" +
                                "    \"message\": \"سلام\",\n" +
                                "    \"providerId\": null,\n" +
                                "    \"applicationId\": \"central-pay\",\n" +
                                "    \"status\": \"PENDING\",\n" +
                                "    \"sendingDate\": 1783245784332,\n" +
                                "    \"deliveryDate\": null,\n" +
                                "    \"phoneDetails\": [\n" +
                                "      {\n" +
                                "        \"phoneId\": null,\n" +
                                "        \"phoneNumber\": \"989125188694\",\n" +
                                "        \"defaultCode\": \"98\"\n" +
                                "      }\n" +
                                "    ],\n" +
                                "    \"providersStatus\": null,\n" +
                                "    \"sendingNumber\": \"989200001420\"\n" +
                                "  }\n" +
                                "}")
                )
        );
    }
}
