package ir.tamin.hub.e2e.rest.basic.security;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;
import static io.restassured.config.RestAssuredConfig.newConfig;
import static io.restassured.http.ContentType.URLENC;

/**
 * Service class responsible for handling authentication and token management.
 */
@Service
@RequiredArgsConstructor
public class SecurityService {

    private final AuthConfigProperties authConfig;
    private String cachedToken;

    /**
     * Retrieves the Access Token.
     * Caches the token to avoid repeated network calls during test execution.
     *
     * @return The access token string.
     * @throws RuntimeException if authentication fails.
     */
    public String getToken() {
        if (cachedToken != null && !cachedToken.isEmpty()) {
            return cachedToken;
        }

        // Configure RestAssured for proper encoding
        RestAssured.config = newConfig().encoderConfig(encoderConfig().defaultContentCharset("UTF-8"));

        Response res = given()
                .contentType(URLENC)
                .formParam("grant_type", "password")
                .formParam("username", authConfig.getUsername())
                .formParam("password", authConfig.getPassword())
                .formParam("client_id", authConfig.getClientId())
                .formParam("client_secret", authConfig.getClientSecret())
                .when()
                .post(authConfig.getTokenUrl())
                .then()
                .extract()
                .response();

        if (res.getStatusCode() == 200) {
            cachedToken = res.jsonPath().getString("access_token");
            return cachedToken;
        } else {
            throw new RuntimeException("Authentication failed. Status: " + res.getStatusCode()
                    + ", Response: " + res.getBody().asString());
        }
    }
}