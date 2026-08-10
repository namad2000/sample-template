package ir.tamin.hub.e2e.rest.resource.bank;

import io.restassured.http.ContentType;
import ir.tamin.hub.container.HubApplication;
import ir.tamin.hub.e2e.rest.basic.config.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest(
        classes = HubApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT // یا DEFINED_PORT
)
@TestPropertySource(locations = "classpath:application-test.yml")
class BankResourceCreateTest extends BaseTest {

    @BeforeEach
    public void setup() {
        String nationalCode = "04933775542";
        setupUserAndGetTokenStub(nationalCode);
    }

    @Test
    public void testCreateBankEndpoint() {
        String requestBody = """
                {
                  "bankCode": "REFAH",
                  "bankName": "رفاه",
                  "active": true
                }
                """;

        given()
                .spec(requestSpec)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("/api/bank/create")
                .then()
                .statusCode(422)
                .body("code", equalTo("BANK_03"))
                .body("message", equalTo("کد بانک 'REFAH' تکراری است!"))
                .body("correlationId", notNullValue());
    }

    @Test
    public void testGetAll_WhenBankDoesNotExist_ShouldReturnEmptyList() {
        String filterJson = """
                 {
                   "property": "code",
                   "value": "MELLAT",
                   "operator": "EQUAL"
                 }
                """;

        given()
                .spec(requestSpec)
                .contentType(ContentType.JSON)
                .queryParam("filter", filterJson)
                .queryParam("start", 0)
                .queryParam("limit", 100)
                .when()
                .get("/api/bank")
                .then()
                .statusCode(200)
                .body("total", equalTo(1));
    }
}