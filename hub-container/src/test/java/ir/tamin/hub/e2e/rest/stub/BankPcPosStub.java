package ir.tamin.hub.e2e.rest.stub;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 10/25/2025
 * Package: ir.tamin.finance.hub.test.stub
 */
public interface BankPcPosStub {

    // --- Path Constants ---
    String TOKEN_PATH = "/connect/token";
    String GET_IDENTIFIER_PATH = "/v1/PcPosTransaction/ReciveIdentifier";
    String START_PAYMENT_PATH = "/v1/PcPosTransaction/StartPayment";
    String INQUIRY_PATH = "/v1/PcPosTransaction/Inquery";

    // ==========================================
    // 1. TOKEN STUBS
    // ==========================================

    default void stubTokenSuccess(String tokenPath, String tokenValue, long expiresIn) {
        stubFor(post(urlEqualTo(tokenPath))
                .withHeader("Content-Type", containing("application/x-www-form-urlencoded"))
                .withHeader("Authorization", matching("Basic .*"))
                .withRequestBody(containing("grant_type=password"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(String.format("{\n" +
                                "  \"access_token\": \"%s\",\n" +
                                "  \"token_type\": \"Bearer\",\n" +
                                "  \"expires_in\": %d,\n" +
                                "  \"scope\": \"SepCentralPcPos openid\"\n" +
                                "}", tokenValue, expiresIn))));
    }

    default void stubTokenSuccess() {
        stubTokenSuccess(TOKEN_PATH, "mocked_access_token_123456789", 3600);
    }

    default void stubTokenFailure(String tokenPath, int statusCode) {
        stubFor(post(urlEqualTo(tokenPath))
                .willReturn(aResponse()
                        .withStatus(statusCode)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"error\": \"invalid_grant\",\n" +
                                "  \"error_description\": \"Invalid user credentials\"\n" +
                                "}")));
    }

    // ==========================================
    // 2. RECEIVE IDENTIFIER STUBS
    // ==========================================

    default void stubReceiveIdentifierSuccess(String identifier) {
        stubFor(post(urlPathEqualTo(GET_IDENTIFIER_PATH))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"IsSuccess\": true,\n" +
                                "  \"ErrorCode\": 0,\n" +
                                "  \"Data\": {\n" +
                                "    \"Identifier\": \"" + identifier + "\"\n" +
                                "  }\n" +
                                "}")));
    }

    default void stubReceiveIdentifierFailure() {
        stubFor(post(urlPathEqualTo(GET_IDENTIFIER_PATH))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"IsSuccess\": false,\n" +
                                "  \"ErrorCode\": 500,\n" +
                                "  \"ErrorDescription\": \"خطا در دریافت شناسه از مرکز\"\n" +
                                "}")));
    }

    // ==========================================
    // 3. START PAYMENT STUBS
    // ==========================================

    default void stubStartPaymentSuccess() {
        stubFor(post(urlPathEqualTo(START_PAYMENT_PATH))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"IsSuccess\": true,\n" +
                                "  \"ErrorCode\": 0,\n" +
                                "  \"Data\": {\n" +
                                "    \"Identifier\": \"100000001001\",\n" +
                                "    \"Terminal\": \"80018001\",\n" +
                                "    \"CreateOn\": \"2026-03-30T14:20:00.000+03:30\",\n" +
                                "    \"TraceNumber\": \"99887711\",\n" +
                                "    \"ResponseCode\": 0\n" +
                                "  }\n" +
                                "}")));
    }

    default void stubStartPaymentError(short errorCode, String errorDescription) {
        stubFor(post(urlPathEqualTo(START_PAYMENT_PATH))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"IsSuccess\": false,\n" +
                                "  \"ErrorCode\": " + errorCode + ",\n" +
                                "  \"ErrorDescription\": \"" + errorDescription + "\"\n" +
                                "}")));
    }

    // ==========================================
    // 4. INQUIRY STUBS
    // ==========================================

    default void stubInquirySuccess(String identifier, String terminalId) {
        stubFor(post(urlPathEqualTo(INQUIRY_PATH))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"IsSuccess\": true,\n" +
                                "  \"ErrorCode\": 0,\n" +
                                "  \"Data\": {\n" +
                                "    \"Identifier\": \"" + identifier + "\",\n" +
                                "    \"TerminalID\": \"" + terminalId + "\",\n" +
                                "    \"TransactionType\": \"10001\",\n" +
                                "    \"AccountType\": \"01\",\n" +
                                "    \"CreateOn\": \"2026-03-30T14:25:00.000+03:30\",\n" +
                                "    \"CreateBy\": \"a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11\",\n" +
                                "    \"ResponseCode\": \"0\",\n" +
                                "    \"ResponseDescription\": \"تراکنش با موفقیت انجام شد\",\n" +
                                "    \"TraceNumber\": \"11223344\",\n" +
                                "    \"ResNum\": \"987654321012\",\n" +
                                "    \"RRN\": \"123456789012\",\n" +
                                "    \"State\": 1,\n" +
                                "    \"StateDescription\": \"تکمیل شده\",\n" +
                                "    \"Amount\": 5000000,\n" +
                                "    \"AffectiveAmount\": \"5000000\",\n" +
                                "    \"PosAppVersion\": \"2.4.0\",\n" +
                                "    \"CardHashNumber\": \"e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855\",\n" +
                                "    \"CardMaskNumber\": \"603799******1234\"\n" +
                                "  }\n" +
                                "}")));
    }

    default void stubInquiryFailedCode(String responseCode) {
        stubFor(post(urlPathEqualTo(INQUIRY_PATH))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"IsSuccess\": false,\n" +
                                "  \"ErrorCode\": 1,\n" +
                                "  \"ErrorDescription\": \"تراکنش ناموفق استعلام شد\",\n" +
                                "  \"Data\": {\n" +
                                "    \"Identifier\": \"100000001002\",\n" +
                                "    \"TerminalID\": \"80018001\",\n" +
                                "    \"TransactionType\": \"10001\",\n" +
                                "    \"AccountType\": \"01\",\n" +
                                "    \"CreateOn\": \"2026-03-30T14:25:00.000+03:30\",\n" +
                                "    \"CreateBy\": \"a0eebc99-9c0b-4ef8-bb6d-6bb9bd380a11\",\n" +
                                "    \"ResponseCode\": \"" + responseCode + "\",\n" +
                                "    \"ResponseDescription\": \"تراکنش ناموفق است\",\n" +
                                "    \"TraceNumber\": \"0\",\n" +
                                "    \"ResNum\": \"0\",\n" +
                                "    \"RRN\": \"\",\n" +
                                "    \"State\": 0,\n" +
                                "    \"StateDescription\": \"ناموفق\",\n" +
                                "    \"Amount\": 0,\n" +
                                "    \"AffectiveAmount\": \"0\",\n" +
                                "    \"PosAppVersion\": \"2.4.0\",\n" +
                                "    \"CardHashNumber\": \"\",\n" +
                                "    \"CardMaskNumber\": \"\"\n" +
                                "  }\n" +
                                "}")));
    }

    default void stubInquiryNotFound() {
        stubFor(post(urlPathEqualTo(INQUIRY_PATH))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("no such transaction found")));
    }
}