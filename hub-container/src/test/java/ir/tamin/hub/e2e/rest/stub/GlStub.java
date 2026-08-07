package ir.tamin.hub.e2e.rest.stub;

import org.springframework.http.MediaType;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 7/5/2026 12:54 PM
 */

public interface GlStub {
    default void setupGlConfirmStub() {
        stubFor(post(urlEqualTo("/gl/api/ledger-data/confirm"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                        .withBody("{\n" +
                                "  \"status\": 200,\n" +
                                "  \"result\": \"{\\\"status\\\": 100, \\\"message\\\": \\\"CONFIRMED\\\"}\"\n" +
                                "}")
                )
        );
    }

    default void setupGlSaveStub() {
        stubFor(post(urlEqualTo("/api/ledger-data/save"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                        .withBody("{\n" +
                                "  \"status\": 200,\n" +
                                "  \"result\": \"{\\\"data\\\": {\\\"status\\\": 100, \\\"message\\\": \\\"SUCCESS\\\"}}\"\n" +
                                "}")
                )
        );
    }

    default void setuGlProcessByRrnStub() {
        stubFor(post(urlEqualTo("/api/ledger-data/process-by-rrn"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                        .withBody("{\n" +
                                "  \"status\": 200,\n" +
                                "  \"result\": \"{\\\"status\\\": 100, \\\"message\\\": \\\"CONFIRMED\\\"}\"\n" +
                                "}")
                )
        );
    }
}
