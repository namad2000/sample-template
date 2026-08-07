package ir.tamin.hub.e2e.rest.stub;

import com.github.tomakehurst.wiremock.client.WireMock;
import org.springframework.http.MediaType;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 7/19/2026 11:22 AM
 * Package: ir.tamin.finance.hub.test.stub
 */

public interface SecurityStub {
    default void setupGetTokenStub() {
        stubFor(post(urlEqualTo("/auth/server/token"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody("{\n" +
                                "  \"access_token\" : \"eyJhbGciOiJSUzI1NiIsImtpZCI6IlphNk9nYTg2b1hRZkU3MmpTVGlxemZHdXh1USJ9.eyJleHAiOjE3Nzc5NjQwMTIsImF1ZCI6IjdmMTQyYjhiMDgzYTA5M2UwZTI1MzExMDFhN2YxOTRlIiwiaXNzIjoiaHR0cDovL2lkbS50YW1pbi5pciIsInVybjp0YW1pbjpqd3Q6Y2xhaW06dG9rZW4tdHlwZSI6ImFjY2Vzc190b2tlbiIsInVybjp0YW1pbjpqd3Q6Y2xhaW06dmVyc2lvbiI6IjEuMCIsImNsaWVudF9pZCI6IjdmMTQyYjhiMDgzYTA5M2UwZTI1MzExMDFhN2YxOTRlIiwiYXpwIjoiN2YxNDJiOGIwODNhMDkzZTBlMjUzMTEwMWE3ZjE5NGUiLCJzdWIiOiIxNDUwMzY3ODQ0IiwidXJuOnRhbWluOmp3dDpjbGFpbTpncm91cHMiOlsiQ09SRSBBQ0NPVU5UIE1BTEktU0VUQUQtQVNOQUQtUkVQT1JUIiwiQ09SRSBBQ0NPVU5UIFNFTklPUi1BRE1JTiBHUk9VUCIsIklOQ09NRSBCQU5LIFNVUFBPUlRFUiIsIklOQ09NRSBCQU5LIEVEQVJFIEtPTCBNQUxJIEJPU1MiLCJDT1JFIEFDQ09VTlQgTUFMSS1LQVJHWkFSSS1EUk1ELVVTRVIiLCJJTkNPTUlORyIsIklOQ09NRSBCQU5LIEVEQVJFIEtPTCBEUk1EIEJPU1MiLCJDRU5UUkFMIFBBWSBPV05FUiBHUk9VUCIsIkNPUkUgQUNDT1VOVCBNQUxJLVNFVEFELUFETUlOIiwiSU5DT01FIEJBTksgRURBUkUgS09MIE1BTEkgU0VUQUQgVVNFUiIsIlNZU1RFTV9ST0xFIiwiQ09SRSBBQ0NPVU5UIE1BTEktU0VDT05ELVNJR05FUiIsIlJTX0ZJTkFOQ0lBTF9IVUJfQkFOS19SRUZBSCIsIkNFTlRSQUwgUEFZIEFETUlOIEdST1VQIiwiQ09SRSBBQ0NPVU5UIE1BTEktQlJBTkNILVBFTlNJT04tUkVQT1JUIiwibW9hdmVuQmFybmFtZXJpemlNYWxpUG9zaHRpYmFuaSIsIkxFREdFUiBBRE1JTiIsIlJTX0ZJTkFOQ0lBTF9IVUJfQkFOS19TQVJNQVlFSCIsIklOQ09NRSBCQU5LIFNFVEFEIENISUVGIElOU1VSQU5DRSBPRkZJQ0VSIiwiQ09SRSBBQ0NPVU5UIE1BTEktU0VUQUQtVVNFUiIsIkNPUkUgQUNDT1VOVCBTVVBQT1JURVIiLCJ0ZXRhTW9kaXJLb2xNYWxpIiwiUlNfRklOQU5DSUFMX0hVQl9CQU5LX1NFUEFIIiwiU0VUQUQgVVNFUiBTT0ZUUE0gIiwiQ09SRSBBQ0NPVU5UIE1BTEktTU9ESVJZQVREQVJNQU4tQVNOQUQtUkVQT1JUIiwiQ09SRSBBQ0NPVU5UIE1BTEktQlJBTkNILVNIT1JUVEVSTS1SRVBPUlQiLCJDT1JFIEFDQ09VTlQgTUFMSS1TRVRBRC1EUk1ELVVTRVIiLCJJTkNPTUUgQkFOSyBCUkFOQ0ggQk9TUyIsIkFETUlOX0NFTlRSQUxfQVNTRVQiLCJGSU5BTkNJQUxfSFVCX0FETUlOIiwiSU5DT01FIEJBTksgQlJBTkNIIEJBSkUgTUFOQUdFUiIsIkNPUkUgQUNDT1VOVCBCQVNFSU5GTy1VU0VSIiwiQ09SRSBBQ0NPVU5UIE1BTEktU0VUQUQiLCJJTkNPTUUgQURNSU4gQkFOSyBTRVRBRCIsIklOQ09NRSBCQU5LIENISUVGIElOU1VSQU5DRSBPRkZJQ0VSIiwiU1lTVEVNX1JPTEVfR1JPVVAiLCJJTkNPTUUgQkFOSyBFREFSRSBLT0wgTkFNTkVWSVNJIiwiUlNfRklOQU5DSUFMX0hVQl9CQU5LX1NBREVSQVQiLCJDT1JFIEFDQ09VTlQgTUFMSS1FREFSRUtPTC1QRU5TSU9OLVJFUE9SVCIsIlJTX0ZJTkFOQ0lBTF9IVUJfQkFOS19LRVNIQVZBUlpJIiwiS0FSUEFaSVJBTiBNQVNURVIgR1JPVVAiLCJHRU5FUkFMIExFREdFUiBBRE1JTklTVFJBVE9SIiwiUlNfRklOQU5DSUFMX0hVQl9CQU5LX01BU0tBTiIsIktBUlBBWklSQU4gTUFTVEVSIiwiSU5DT01FIEJBTksgQlJBTkNIIERSTUQgTUFOQUdFUiIsIklOQ09NRSBCQU5LIEJSQU5DSCBGQU5JIiwiQUxMIFVTRVJTIiwiUlNfRklOQU5DSUFMX0hVQl9CQU5LIiwiSU5DT01FIEJBTksgRURBUkUgS09MIFBST1ZJTkNFIE1BTkFHRVIiLCJDT1JFIEFDQ09VTlQgU0FUQV9IT1NQSVRBTF9PTkxJTkVfUEFZTUVOVF9QQVkiLCJJTlZPSUNFIEFETUlOIiwiQ09SRSBBQ0NPVU5UIE1BTEktQlJBTkNILURSTUQtVVNFUiIsIlRFVEEtTU9ESVItS09MLU1BTEkiLCJDT1JFIEFDQ09VTlQgUFVCTElDLVVTRVIiLCJJTkNPTUUgQkFOSyBTRVRBRCBVU0VSIiwiQ09SRSBBQ0NPVU5UIFNBVEFfSE9TUElUQUxfT05MSU5FX1BBWU1FTlRfQUREIiwiSU5DT01FIEJBTksgRURBUkUgS09MIEFNQVIgU0VUQUQgVVNFUiIsIklOQ09NRSBCQU5LIEJSQU5DSCBOQU1ORVZJU0kiLCJSU19GSU5BTkNJQUxfSFVCX0JBTktfUE9TVEJBTksiLCJDT1JFIEFDQ09VTlQgTUFMSS1TRVRBRC1QRU5TSU9OLVJFUE9SVCIsIlJTX0ZJTkFOQ0lBTF9IVUJfQkFOS19NRUxMSSIsIlRGSCBBRE1JTiIsIkNFTlRSQUwgUEFZIE9XTkVSIiwiQ09SRSBBQ0NPVU5UIE1BTEktU0VUQUQtU0hPUlRURVJNLURPQ1VNRU5UIiwiSU5DT01FIEJBTksgQlJBTkNIIEFDQ09VTlRBTlQgTUFOQUdFUiIsItiq2KfYstmHIiwiQ09SRSBBQ0NPVU5UIE1BTEktU0VUQUQtU0hPUlRURVJNLVJFUE9SVCIsIklOQ09NRSBCQU5LIEVEQVJFIEtPTCBBTUFSIFVTRVIiLCJJTkNPTUUgQkFOSyBFREFSRSBLT0wgRkFOSSIsIlJTX0ZJTkFOQ0lBTF9IVUJfSU5TVVJBTkNFIiwiVEZIIEFETUlOIEdST1VQIiwiQ09SRSBBQ0NPVU5UIE1BTEktT1JHLUFTTkFELVJFUE9SVCIsIkNPUkUgQUNDT1VOVCBNQUxJLVNFVEFELVBFTlNJT04tVVNFUiIsIklOQ09NRSBCQU5LIEVEQVJFIEtPTCBDSElFRiBJTlNVUkFOQ0UgUFJPVklOQ0UiLCJDT1JFIEFDQ09VTlQgU0VOSU9SLUFETUlOIiwiUlNfRklOQU5DSUFMX0hVQl9CQU5LX1RFSkFSQVQiLCJURVRBTU9ESVJLT0xNQUxJIiwiQ09SRSBBQ0NPVU5UIE1BTEktU0VUQUQtQVNOQUQtVVNFUiIsIlJTX0ZJTkFOQ0lBTF9IVUJfQkFOS19NRUxMQVQiLCJJTlZPSUNFIEFETUlOIEdST1VQIiwiSU5DT01FIEJBTksgT1NUQU4gRkFOSSIsIkNFTlRSQUwgUEFZIEFETUlOIl0sImdyb3VwcyI6WyJDT1JFIEFDQ09VTlQgTUFMSS1TRVRBRC1BU05BRC1SRVBPUlQiLCJDT1JFIEFDQ09VTlQgU0VOSU9SLUFETUlOIEdST1VQIiwiSU5DT01FIEJBTksgU1VQUE9SVEVSIiwiSU5DT01FIEJBTksgRURBUkUgS09MIE1BTEkgQk9TUyIsIkNPUkUgQUNDT1VOVCBNQUxJLUtBUkdaQVJJLURSTUQtVVNFUiIsIklOQ09NSU5HIiwiSU5DT01FIEJBTksgRURBUkUgS09MIERSTUQgQk9TUyIsIkNFTlRSQUwgUEFZIE9XTkVSIEdST1VQIiwiQ09SRSBBQ0NPVU5UIE1BTEktU0VUQUQtQURNSU4iLCJJTkNPTUUgQkFOSyBFREFSRSBLT0wgTUFMSSBTRVRBRCBVU0VSIiwiU1lTVEVNX1JPTEUiLCJDT1JFIEFDQ09VTlQgTUFMSS1TRUNPTkQtU0lHTkVSIiwiUlNfRklOQU5DSUFMX0hVQl9CQU5LX1JFRkFIIiwiQ0VOVFJBTCBQQVkgQURNSU4gR1JPVVAiLCJDT1JFIEFDQ09VTlQgTUFMSS1CUkFOQ0gtUEVOU0lPTi1SRVBPUlQiLCJtb2F2ZW5CYXJuYW1lcml6aU1hbGlQb3NodGliYW5pIiwiTEVER0VSIEFETUlOIiwiUlNfRklOQU5DSUFMX0hVQl9CQU5LX1NBUk1BWUVIIiwiSU5DT01FIEJBTksgU0VUQUQgQ0hJRUYgSU5TVVJBTkNFIE9GRklDRVIiLCJDT1JFIEFDQ09VTlQgTUFMSS1TRVRBRC1VU0VSIiwiQ09SRSBBQ0NPVU5UIFNVUFBPUlRFUiIsInRldGFNb2RpcktvbE1hbGkiLCJSU19GSU5BTkNJQUxfSFVCX0JBTktfU0VQQUgiLCJTRVRBRCBVU0VSIFNPRlRQTSAiLCJDT1JFIEFDQ09VTlQgTUFMSS1NT0RJUllBVERBUk1BTi1BU05BRC1SRVBPUlQiLCJDT1JFIEFDQ09VTlQgTUFMSS1CUkFOQ0gtU0hPUlRURVJNLVJFUE9SVCIsIkNPUkUgQUNDT1VOVCBNQUxJLVNFVEFELURSTUQtVVNFUiIsIklOQ09NRSBCQU5LIEJSQU5DSCBCT1NTIiwiQURNSU5fQ0VOVFJBTF9BU1NFVCIsIkZJTkFOQ0lBTF9IVUJfQURNSU4iLCJJTkNPTUUgQkFOSyBCUkFOQ0ggQkFKRSBNQU5BR0VSIiwiQ09SRSBBQ0NPVU5UIEJBU0VJTkZPLVVTRVIiLCJDT1JFIEFDQ09VTlQgTUFMSS1TRVRBRCIsIklOQ09NRSBBRE1JTiBCQU5LIFNFVEFEIiwiSU5DT01FIEJBTksgQ0hJRUYgSU5TVVJBTkNFIE9GRklDRVIiLCJTWVNURU1fUk9MRV9HUk9VUCIsIklOQ09NRSBCQU5LIEVEQVJFIEtPTCBOQU1ORVZJU0kiLCJSU19GSU5BTkNJQUxfSFVCX0JBTktfU0FERVJBVCIsIkNPUkUgQUNDT1VOVCBNQUxJLUVEQVJFS09MLVBFTlNJT04tUkVQT1JUIiwiUlNfRklOQU5DSUFMX0hVQl9CQU5LX0tFU0hBVkFSWkkiLCJLQVJQQVpJUkFOIE1BU1RFUiBHUk9VUCIsIkdFTkVSQUwgTEVER0VSIEFETUlOSVNUUkFUT1IiLCJSU19GSU5BTkNJQUxfSFVCX0JBTktfTUFTS0FOIiwiS0FSUEFaSVJBTiBNQVNURVIiLCJJTkNPTUUgQkFOSyBCUkFOQ0ggRFJNRCBNQU5BR0VSIiwiSU5DT01FIEJBTksgQlJBTkNIIEZBTkkiLCJBTEwgVVNFUlMiLCJSU19GSU5BTkNJQUxfSFVCX0JBTksiLCJJTkNPTUUgQkFOSyBFREFSRSBLT0wgUFJPVklOQ0UgTUFOQUdFUiIsIkNPUkUgQUNDT1VOVCBTQVRBX0hPU1BJVEFMX09OTElORV9QQVlNRU5UX1BBWSIsIklOVk9JQ0UgQURNSU4iLCJDT1JFIEFDQ09VTlQgTUFMSS1CUkFOQ0gtRFJNRC1VU0VSIiwiVEVUQS1NT0RJUi1LT0wtTUFMSSIsIkNPUkUgQUNDT1VOVCBQVUJMSUMtVVNFUiIsIklOQ09NRSBCQU5LIFNFVEFEIFVTRVIiLCJDT1JFIEFDQ09VTlQgU0FUQV9IT1NQSVRBTF9PTkxJTkVfUEFZTUVOVF9BREQiLCJJTkNPTUUgQkFOSyBFREFSRSBLT0wgQU1BUiBTRVRBRCBVU0VSIiwiSU5DT01FIEJBTksgQlJBTkNIIE5BTU5FVklTSSIsIlJTX0ZJTkFOQ0lBTF9IVUJfQkFOS19QT1NUQkFOSyIsIkNPUkUgQUNDT1VOVCBNQUxJLVNFVEFELVBFTlNJT04tUkVQT1JUIiwiUlNfRklOQU5DSUFMX0hVQl9CQU5LX01FTExJIiwiVEZIIEFETUlOIiwiQ0VOVFJBTCBQQVkgT1dORVIiLCJDT1JFIEFDQ09VTlQgTUFMSS1TRVRBRC1TSE9SVFRFUk0tRE9DVU1FTlQiLCJJTkNPTUUgQkFOSyBCUkFOQ0ggQUNDT1VOVEFOVCBNQU5BR0VSIiwi2KrYp9iy2YciLCJDT1JFIEFDQ09VTlQgTUFMSS1TRVRBRC1TSE9SVFRFUk0tUkVQT1JUIiwiSU5DT01FIEJBTksgRURBUkUgS09MIEFNQVIgVVNFUiIsIklOQ09NRSBCQU5LIEVEQVJFIEtPTCBGQU5JIiwiUlNfRklOQU5DSUFMX0hVQl9JTlNVUkFOQ0UiLCJURkggQURNSU4gR1JPVVAiLCJDT1JFIEFDQ09VTlQgTUFMSS1PUkctQVNOQUQtUkVQT1JUIiwiQ09SRSBBQ0NPVU5UIE1BTEktU0VUQUQtUEVOU0lPTi1VU0VSIiwiSU5DT01FIEJBTksgRURBUkUgS09MIENISUVGIElOU1VSQU5DRSBQUk9WSU5DRSIsIkNPUkUgQUNDT1VOVCBTRU5JT1ItQURNSU4iLCJSU19GSU5BTkNJQUxfSFVCX0JBTktfVEVKQVJBVCIsIlRFVEFNT0RJUktPTE1BTEkiLCJDT1JFIEFDQ09VTlQgTUFMSS1TRVRBRC1BU05BRC1VU0VSIiwiUlNfRklOQU5DSUFMX0hVQl9CQU5LX01FTExBVCIsIklOVk9JQ0UgQURNSU4gR1JPVVAiLCJJTkNPTUUgQkFOSyBPU1RBTiBGQU5JIiwiQ0VOVFJBTCBQQVkgQURNSU4iXSwidXJuOnRhbWluOmp3dDpjbGFpbTpvcmciOiIwMDAwIiwianRpIjoiS1lBZFZfc09sUGh6YWg3UWQ3Tmk1USIsImlhdCI6MTc3Nzk2MDQxMywibmJmIjoxNzc3OTYwMjkzfQ.PII44VnxZO2tWFEWE3JTER66ZKrK9lkcUEUkNxU2B8KskkmEzEw7yYF1cFCQ6hTnOe7Ok3AbO8Ed58znPSzSsPD--cr4QcDGl4G7WpqFyLJI5ApOZNuj07-8vpM1BOPRxEXq6taqAOhCNAjSrTRBWxRpRx7Bz9yrYXLTVhLBVxUZHxR0dPHX-w5ciJ4yaxOck0SIP07vd2z_xExOgUVFapwXKN62ZESMXPJwGVuh5DnTwQUjrq5NWGVbQ9mBSlWP3wwWrsjhNsfk9cwtJQQZMdpmscsq5YSg-S9IqaAuX9-YWSwJyMMDb1a0-jwVRwuvOpEXpa_1MtT9cuPFwZM8gA\",\n" +
                                "  \"token_type\" : \"Bearer\",\n" +
                                "  \"expires_in\" : 3600\n" +
                                "}")
                )
        );
    }

    default void setupUserStub(String nationalCode) {
        String mockResponse = "{\n" +
                "  \"status\" : 200,\n" +
                "  \"family\" : \"SUCCESSFUL\",\n" +
                "  \"reason\" : \"OK\",\n" +
                "  \"data\" : {\n" +
                "    \"entityId\" : \"126404\",\n" +
                "    \"login\" : \"1450367844\",\n" +
                "    \"organizationKey\" : 21,\n" +
                "    \"firstName\" : \"داود\",\n" +
                "    \"lastName\" : \"اکبری\",\n" +
                "    \"middleName\" : null,\n" +
                "    \"displayName\" : \"داود اکبری\",\n" +
                "    \"commonName\" : null,\n" +
                "    \"startDate\" : null,\n" +
                "    \"endDate\" : null,\n" +
                "    \"provisioningDate\" : null,\n" +
                "    \"deprovisioningDate\" : null,\n" +
                "    \"provisionedDate\" : null,\n" +
                "    \"deprovisionedDate\" : null,\n" +
                "    \"policyUpdateEnabled\" : null,\n" +
                "    \"status\" : \"Active\",\n" +
                "    \"accountStatus\" : \"0\",\n" +
                "    \"userDisabled\" : null,\n" +
                "    \"email\" : null,\n" +
                "    \"userType\" : \"End-User\",\n" +
                "    \"employeeType\" : \"Temp\",\n" +
                "    \"managerKey\" : null,\n" +
                "    \"password\" : \"7710960091706787559922f0374bcf8dcd017b31f9846f5f9f98daeb618b3bc1\",\n" +
                "    \"confitmPassword\" : null,\n" +
                "    \"passwordWarned\" : null,\n" +
                "    \"passwordExpired\" : null,\n" +
                "    \"loginAttemptsCounter\" : \"0\",\n" +
                "    \"passwordReAttemptsCounter\" : \"0\",\n" +
                "    \"changePasswordAtNextLogin\" : \"false\",\n" +
                "    \"passwordMinimumAge\" : null,\n" +
                "    \"timezone\" : null,\n" +
                "    \"locale\" : null,\n" +
                "    \"country\" : null,\n" +
                "    \"description\" : null,\n" +
                "    \"employeeNumber\" : null,\n" +
                "    \"generationQualifier\" : null,\n" +
                "    \"ldapOrganization\" : null,\n" +
                "    \"ldapOrganizationUnit\" : null,\n" +
                "    \"numberFormat\" : null,\n" +
                "    \"dateFormat\" : null,\n" +
                "    \"timeFormat\" : null,\n" +
                "    \"language\" : null,\n" +
                "    \"territory\" : null,\n" +
                "    \"nationalCode\" : \"" + nationalCode + "\",\n" +
                "    \"mobile\" : \"09125188694\",\n" +
                "    \"gender\" : \"m\",\n" +
                "    \"birthDate\" : 1616272200000,\n" +
                "    \"automaticallyDeleteDate\" : null,\n" +
                "    \"accountLockedDate\" : null,\n" +
                "    \"passwordCantChange\" : null,\n" +
                "    \"passwordMustChange\" : \"false\",\n" +
                "    \"passwordNeverExpires\" : null,\n" +
                "    \"creationDate\" : null,\n" +
                "    \"creationDateFarsi\" : null,\n" +
                "    \"passwordExpireDate\" : null,\n" +
                "    \"passwordExpireDateFarsi\" : null,\n" +
                "    \"passwordWarnDate\" : null,\n" +
                "    \"manuallyLocked\" : null,\n" +
                "    \"passwordGenerated\" : null,\n" +
                "    \"ldapGUID\" : null,\n" +
                "    \"ldapDN\" : null,\n" +
                "    \"userDetail\" : {\n" +
                "      \"id\" : 327683,\n" +
                "      \"oimUserId\" : \"126404\",\n" +
                "      \"geoUnit\" : null,\n" +
                "      \"userDetailWidgets\" : null,\n" +
                "      \"userDetailDevices\" : null\n" +
                "    },\n" +
                "    \"roles\" : [ {\n" +
                "      \"id\" : \"100150\",\n" +
                "      \"roleName\" : \"LEDGER ADMIN\",\n" +
                "      \"roleDisplayName\" : \"ارشد دفتر کل\",\n" +
                "      \"roleUniqueName\" : \"LEDGER ADMIN\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038232175\"\n" +
                "    }, {\n" +
                "      \"id\" : \"100146\",\n" +
                "      \"roleName\" : \"GENERAL LEDGER ADMINISTRATOR\",\n" +
                "      \"roleDisplayName\" : \"مديريت سامانه دفتر کل\",\n" +
                "      \"roleUniqueName\" : \"GENERAL LEDGER ADMINISTRATOR\",\n" +
                "      \"roleDescription\" : \"مديريت سامانه دفتر کل\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038232175\"\n" +
                "    }, {\n" +
                "      \"id\" : \"3\",\n" +
                "      \"roleName\" : \"ALL USERS\",\n" +
                "      \"roleDisplayName\" : \"ALL USERS\",\n" +
                "      \"roleUniqueName\" : \"ALL USERS\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"751\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT PUBLIC-USER\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT PUBLIC-USER\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT PUBLIC-USER\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT PUBLIC-USER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"621\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT SENIOR-ADMIN GROUP\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT SENIOR-ADMIN GROUP\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT SENIOR-ADMIN GROUP\",\n" +
                "      \"roleDescription\" : \" CORE ACCOUNT SENIOR-ADMIN GROUP\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"752\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT BASEINFO-USER\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT BASEINFO-USER\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT BASEINFO-USER\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT BASEINFO-USER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"604\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT SUPPORTER\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT SUPPORTER\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT SUPPORTER\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT SUPPORTER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"584\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-SETAD-ADMIN\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-SETAD-ADMIN\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-SETAD-ADMIN\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-SETAD-ADMIN\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"641\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-SECOND-SIGNER\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-SECOND-SIGNER\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-SECOND-SIGNER\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-SECOND-SIGNER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"585\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-SETAD-USER\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-SETAD-USER\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-SETAD-USER\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-SETAD-USER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"744\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-SETAD-ASNAD-USER\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-SETAD-ASNAD-USER\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-SETAD-ASNAD-USER\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-SETAD-ASNAD-USER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"846\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-SETAD-PENSION-USER\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-SETAD-PENSION-USER\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-SETAD-PENSION-USER\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-SETAD-PENSION-USER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"748\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-SETAD-DRMD-USER\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-SETAD-DRMD-USER\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-SETAD-DRMD-USER\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-SETAD-DRMD-USER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"749\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-BRANCH-DRMD-USER\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-BRANCH-DRMD-USER\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-BRANCH-DRMD-USER\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-BRANCH-DRMD-USER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1289\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-BRANCH-SHORTTERM-REPORT\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-BRANCH-SHORTTERM-REPORT\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-BRANCH-SHORTTERM-REPORT\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-BRANCH-SHORTTERM-REPORT\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1286\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-BRANCH-PENSION-REPORT\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-BRANCH-PENSION-REPORT\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-BRANCH-PENSION-REPORT\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-BRANCH-PENSION-REPORT\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"750\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-KARGZARI-DRMD-USER\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-KARGZARI-DRMD-USER\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-KARGZARI-DRMD-USER\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-KARGZARI-DRMD-USER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1287\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-SETAD-SHORTTERM-REPORT\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-SETAD-SHORTTERM-REPORT\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-SETAD-SHORTTERM-REPORT\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-SETAD-SHORTTERM-REPORT\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1285\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-EDAREKOL-PENSION-REPORT\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-EDAREKOL-PENSION-REPORT\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-EDAREKOL-PENSION-REPORT\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-EDAREKOL-PENSION-REPORT\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1284\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-SETAD-PENSION-REPORT\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-SETAD-PENSION-REPORT\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-SETAD-PENSION-REPORT\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-SETAD-PENSION-REPORT\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1283\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-ORG-ASNAD-REPORT\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-ORG-ASNAD-REPORT\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-ORG-ASNAD-REPORT\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-ORG-ASNAD-REPORT\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1282\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-MODIRYATDARMAN-ASNAD-REPORT\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-MODIRYATDARMAN-ASNAD-REPORT\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-MODIRYATDARMAN-ASNAD-REPORT\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-MODIRYATDARMAN-ASNAD-REPORT\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1281\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT MALI-SETAD-ASNAD-REPORT\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT MALI-SETAD-ASNAD-REPORT\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT MALI-SETAD-ASNAD-REPORT\",\n" +
                "      \"roleDescription\" : \"CORE ACCOUNT MALI-SETAD-ASNAD-REPORT\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"77407\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT SATA_HOSPITAL_ONLINE_PAYMENT_ADD\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT SATA_HOSPITAL_ONLINE_PAYMENT_ADD\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT SATA_HOSPITAL_ONLINE_PAYMENT_ADD\",\n" +
                "      \"roleDescription\" : \"ايجاد کننده پرداخت بيمارستاني\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"77406\",\n" +
                "      \"roleName\" : \"CORE ACCOUNT SATA_HOSPITAL_ONLINE_PAYMENT_PAY\",\n" +
                "      \"roleDisplayName\" : \"CORE ACCOUNT SATA_HOSPITAL_ONLINE_PAYMENT_PAY\",\n" +
                "      \"roleUniqueName\" : \"CORE ACCOUNT SATA_HOSPITAL_ONLINE_PAYMENT_PAY\",\n" +
                "      \"roleDescription\" : \"پرداخت کننده بيمارستاني\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"243\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96104\",\n" +
                "      \"roleName\" : \"FINANCIAL_HUB_ADMIN\",\n" +
                "      \"roleDisplayName\" : \"FINANCIAL_HUB_ADMIN\",\n" +
                "      \"roleUniqueName\" : \"FINANCIAL_HUB_ADMIN\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96106\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96113\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_KESHAVARZI\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_KESHAVARZI\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_KESHAVARZI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96115\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_MASKAN\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_MASKAN\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_MASKAN\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96110\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_MELLAT\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_MELLAT\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_MELLAT\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96109\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_MELLI\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_MELLI\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_MELLI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96116\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_POSTBANK\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_POSTBANK\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_POSTBANK\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96108\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_REFAH\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_REFAH\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_REFAH\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96112\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_SADERAT\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_SADERAT\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_SADERAT\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96107\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_SARMAYEH\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_SARMAYEH\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_SARMAYEH\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96114\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_SEPAH\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_SEPAH\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_SEPAH\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96111\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_TEJARAT\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_TEJARAT\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_TEJARAT\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96105\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_INSURANCE\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_INSURANCE\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_INSURANCE\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99354\",\n" +
                "      \"roleName\" : \"INCOME BANK EDARE KOL MALI SETAD USER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK EDARE KOL MALI SETAD USER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK EDARE KOL MALI SETAD USER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1471\",\n" +
                "      \"roleName\" : \"INCOME BANK SUPPORTER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK SUPPORTER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK SUPPORTER\",\n" +
                "      \"roleDescription\" : \"INCOME BANK SUPPORTER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"401\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1468\",\n" +
                "      \"roleName\" : \"INCOME BANK SETAD USER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK SETAD USER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK SETAD USER\",\n" +
                "      \"roleDescription\" : \"INCOME BANK SETAD USER\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"401\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99355\",\n" +
                "      \"roleName\" : \"INCOME BANK SETAD CHIEF INSURANCE OFFICER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK SETAD CHIEF INSURANCE OFFICER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK SETAD CHIEF INSURANCE OFFICER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99356\",\n" +
                "      \"roleName\" : \"INCOME BANK EDARE KOL AMAR SETAD USER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK EDARE KOL AMAR SETAD USER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK EDARE KOL AMAR SETAD USER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99357\",\n" +
                "      \"roleName\" : \"INCOME BANK BRANCH DRMD MANAGER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK BRANCH DRMD MANAGER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK BRANCH DRMD MANAGER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99358\",\n" +
                "      \"roleName\" : \"INCOME BANK BRANCH BAJE MANAGER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK BRANCH BAJE MANAGER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK BRANCH BAJE MANAGER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99359\",\n" +
                "      \"roleName\" : \"INCOME BANK BRANCH ACCOUNTANT MANAGER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK BRANCH ACCOUNTANT MANAGER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK BRANCH ACCOUNTANT MANAGER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1465\",\n" +
                "      \"roleName\" : \"INCOME BANK BRANCH BOSS\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK BRANCH BOSS\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK BRANCH BOSS\",\n" +
                "      \"roleDescription\" : \"INCOME BANK BRANCH BOSS\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"401\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99360\",\n" +
                "      \"roleName\" : \"INCOME BANK CHIEF INSURANCE OFFICER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK CHIEF INSURANCE OFFICER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK CHIEF INSURANCE OFFICER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99361\",\n" +
                "      \"roleName\" : \"INCOME BANK EDARE KOL DRMD BOSS\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK EDARE KOL DRMD BOSS\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK EDARE KOL DRMD BOSS\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99362\",\n" +
                "      \"roleName\" : \"INCOME BANK EDARE KOL MALI BOSS\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK EDARE KOL MALI BOSS\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK EDARE KOL MALI BOSS\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99363\",\n" +
                "      \"roleName\" : \"INCOME BANK EDARE KOL CHIEF INSURANCE PROVINCE\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK EDARE KOL CHIEF INSURANCE PROVINCE\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK EDARE KOL CHIEF INSURANCE PROVINCE\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99364\",\n" +
                "      \"roleName\" : \"INCOME BANK EDARE KOL PROVINCE MANAGER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK EDARE KOL PROVINCE MANAGER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK EDARE KOL PROVINCE MANAGER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99365\",\n" +
                "      \"roleName\" : \"INCOME BANK EDARE KOL AMAR USER\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK EDARE KOL AMAR USER\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK EDARE KOL AMAR USER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99366\",\n" +
                "      \"roleName\" : \"INCOME BANK OSTAN FANI\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK OSTAN FANI\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK OSTAN FANI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99367\",\n" +
                "      \"roleName\" : \"INCOME BANK EDARE KOL FANI\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK EDARE KOL FANI\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK EDARE KOL FANI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99368\",\n" +
                "      \"roleName\" : \"INCOME BANK BRANCH NAMNEVISI\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK BRANCH NAMNEVISI\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK BRANCH NAMNEVISI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99369\",\n" +
                "      \"roleName\" : \"INCOME BANK EDARE KOL NAMNEVISI\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK EDARE KOL NAMNEVISI\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK EDARE KOL NAMNEVISI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99369\",\n" +
                "      \"roleName\" : \"INCOME BANK EDARE KOL NAMNEVISI\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK EDARE KOL NAMNEVISI\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK EDARE KOL NAMNEVISI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99370\",\n" +
                "      \"roleName\" : \"INCOME BANK BRANCH FANI\",\n" +
                "      \"roleDisplayName\" : \"INCOME BANK BRANCH FANI\",\n" +
                "      \"roleUniqueName\" : \"INCOME BANK BRANCH FANI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96106\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96104\",\n" +
                "      \"roleName\" : \"FINANCIAL_HUB_ADMIN\",\n" +
                "      \"roleDisplayName\" : \"FINANCIAL_HUB_ADMIN\",\n" +
                "      \"roleUniqueName\" : \"FINANCIAL_HUB_ADMIN\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96105\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_INSURANCE\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_INSURANCE\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_INSURANCE\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"96109\",\n" +
                "      \"roleName\" : \"RS_FINANCIAL_HUB_BANK_MELLI\",\n" +
                "      \"roleDisplayName\" : \"RS_FINANCIAL_HUB_BANK_MELLI\",\n" +
                "      \"roleUniqueName\" : \"RS_FINANCIAL_HUB_BANK_MELLI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"100072\",\n" +
                "      \"roleName\" : \"KARPAZIRAN MASTER GROUP\",\n" +
                "      \"roleDisplayName\" : \"گروه مديريت کارپذيران\",\n" +
                "      \"roleUniqueName\" : \"KARPAZIRAN MASTER GROUP\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038181420\"\n" +
                "    }, {\n" +
                "      \"id\" : \"100073\",\n" +
                "      \"roleName\" : \"KARPAZIRAN MASTER\",\n" +
                "      \"roleDisplayName\" : \"مدير کارپذيران\",\n" +
                "      \"roleUniqueName\" : \"KARPAZIRAN MASTER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038181420\"\n" +
                "    }, {\n" +
                "      \"id\" : \"95204\",\n" +
                "      \"roleName\" : \"SYSTEM_ROLE_GROUP\",\n" +
                "      \"roleDisplayName\" : \"گروه نقش سيستمي\",\n" +
                "      \"roleUniqueName\" : \"SYSTEM_ROLE_GROUP\",\n" +
                "      \"roleDescription\" : \"گروه نقش سيستمي\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"95354\",\n" +
                "      \"roleName\" : \"SYSTEM_ROLE\",\n" +
                "      \"roleDisplayName\" : \"نقش سيستمي\",\n" +
                "      \"roleUniqueName\" : \"SYSTEM_ROLE\",\n" +
                "      \"roleDescription\" : \"نقش سيستمي\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"95407\",\n" +
                "      \"roleName\" : \"SETAD USER SOFTPM \",\n" +
                "      \"roleDisplayName\" : \"SETAD USER SOFTPM \",\n" +
                "      \"roleUniqueName\" : \"SETAD USER SOFTPM \",\n" +
                "      \"roleDescription\" : \"کارشناس ستاد مرکزي\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"99604\",\n" +
                "      \"roleName\" : \"ADMIN_CENTRAL_ASSET\",\n" +
                "      \"roleDisplayName\" : \"ADMIN_CENTRAL_ASSET\",\n" +
                "      \"roleUniqueName\" : \"ADMIN_CENTRAL_ASSET\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"102874\",\n" +
                "      \"roleName\" : \"INCOMING\",\n" +
                "      \"roleDisplayName\" : \"INCOMING\",\n" +
                "      \"roleUniqueName\" : \"INCOMING\",\n" +
                "      \"roleDescription\" : \"test\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038259601\"\n" +
                "    }, {\n" +
                "      \"id\" : \"102875\",\n" +
                "      \"roleName\" : \"INCOME ADMIN BANK SETAD\",\n" +
                "      \"roleDisplayName\" : \"INCOME ADMIN BANK SETAD\",\n" +
                "      \"roleUniqueName\" : \"INCOME ADMIN BANK SETAD\",\n" +
                "      \"roleDescription\" : \"test\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038259601\"\n" +
                "    }, {\n" +
                "      \"id\" : \"102877\",\n" +
                "      \"roleName\" : \"INVOICE ADMIN GROUP\",\n" +
                "      \"roleDisplayName\" : \"ادمين سامانه صورتحساب\",\n" +
                "      \"roleUniqueName\" : \"INVOICE ADMIN GROUP\",\n" +
                "      \"roleDescription\" : \"ادمين سامانه صورتحساب\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038299163\"\n" +
                "    }, {\n" +
                "      \"id\" : \"102879\",\n" +
                "      \"roleName\" : \"INVOICE ADMIN\",\n" +
                "      \"roleDisplayName\" : \"ادمين صورتحساب\",\n" +
                "      \"roleUniqueName\" : \"INVOICE ADMIN\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038299163\"\n" +
                "    }, {\n" +
                "      \"id\" : \"102955\",\n" +
                "      \"roleName\" : \"tetaModirKolMali\",\n" +
                "      \"roleDisplayName\" : \"TETAMODIRKOLMALI GROUP\",\n" +
                "      \"roleUniqueName\" : \"tetaModirKolMali\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038252231\"\n" +
                "    }, {\n" +
                "      \"id\" : \"102954\",\n" +
                "      \"roleName\" : \"TETAMODIRKOLMALI\",\n" +
                "      \"roleDisplayName\" : \"TETAMODIRKOLMALI\",\n" +
                "      \"roleUniqueName\" : \"TETAMODIRKOLMALI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038252231\"\n" +
                "    }, {\n" +
                "      \"id\" : \"103109\",\n" +
                "      \"roleName\" : \"CENTRAL PAY OWNER GROUP\",\n" +
                "      \"roleDisplayName\" : \"central-pay-owner\",\n" +
                "      \"roleUniqueName\" : \"CENTRAL PAY OWNER GROUP\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038358357\"\n" +
                "    }, {\n" +
                "      \"id\" : \"103111\",\n" +
                "      \"roleName\" : \"CENTRAL PAY OWNER\",\n" +
                "      \"roleDisplayName\" : \"CENTRAL-PAY-OWNER\",\n" +
                "      \"roleUniqueName\" : \"CENTRAL PAY OWNER\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038358357\"\n" +
                "    }, {\n" +
                "      \"id\" : \"103110\",\n" +
                "      \"roleName\" : \"CENTRAL PAY ADMIN GROUP\",\n" +
                "      \"roleDisplayName\" : \"central-pay-admin\",\n" +
                "      \"roleUniqueName\" : \"CENTRAL PAY ADMIN GROUP\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038358357\"\n" +
                "    }, {\n" +
                "      \"id\" : \"103112\",\n" +
                "      \"roleName\" : \"CENTRAL PAY ADMIN\",\n" +
                "      \"roleDisplayName\" : \"CENTRAL-PAY-ADMIN\",\n" +
                "      \"roleUniqueName\" : \"CENTRAL PAY ADMIN\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1038358357\"\n" +
                "    }, {\n" +
                "      \"id\" : \"103057\",\n" +
                "      \"roleName\" : \"TFH ADMIN GROUP\",\n" +
                "      \"roleDisplayName\" : \"TFH ADMIN GROUP\",\n" +
                "      \"roleUniqueName\" : \"TFH ADMIN GROUP\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"1901\",\n" +
                "      \"roleName\" : \"TFH ADMIN\",\n" +
                "      \"roleDisplayName\" : \"TFH ADMIN\",\n" +
                "      \"roleUniqueName\" : \"TFH ADMIN\",\n" +
                "      \"roleDescription\" : \"TFH ADMIN\",\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"103259\",\n" +
                "      \"roleName\" : \"TETA-MOAVEN-BARNAMEHRIZI-MALI-POSHTIBANI-GROUP\",\n" +
                "      \"roleDisplayName\" : \"TETA-MOAVEN-BARNAMEHRIZI-MALI-POSHTIBANI\",\n" +
                "      \"roleUniqueName\" : \"TETA-MOAVEN-BARNAMEHRIZI-MALI-POSHTIBANI-GROUP\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    }, {\n" +
                "      \"id\" : \"98556\",\n" +
                "      \"roleName\" : \"TETA-MOAVEN-BARNAMEHRIZI-MALI-POSHTIBANI\",\n" +
                "      \"roleDisplayName\" : \"TETA-MOAVEN-BARNAMEHRIZI-MALI-POSHTIBANI\",\n" +
                "      \"roleUniqueName\" : \"TETA-MOAVEN-BARNAMEHRIZI-MALI-POSHTIBANI\",\n" +
                "      \"roleDescription\" : null,\n" +
                "      \"email\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : \"0052780783\",\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"ownerKey\" : null,\n" +
                "      \"roleCategory\" : \"1\"\n" +
                "    } ],\n" +
                "    \"organization\" : {\n" +
                "      \"entityId\" : \"21\",\n" +
                "      \"children\" : null,\n" +
                "      \"create\" : null,\n" +
                "      \"createdBy\" : null,\n" +
                "      \"update\" : null,\n" +
                "      \"updateBy\" : null,\n" +
                "      \"organizationStatus\" : \"Active\",\n" +
                "      \"organizationName\" : \"ستاد مرکزي\",\n" +
                "      \"organizationCustomerType\" : \"Company\",\n" +
                "      \"parent\" : null,\n" +
                "      \"code\" : \"0000\",\n" +
                "      \"organizationDetail\" : {\n" +
                "        \"id\" : 76999,\n" +
                "        \"oimOrganizationId\" : \"21\",\n" +
                "        \"geoUnit\" : {\n" +
                "          \"id\" : 420,\n" +
                "          \"code\" : \"1870\",\n" +
                "          \"title\" : \"تهران بزرگ\",\n" +
                "          \"description\" : \"تهران بزرگ\",\n" +
                "          \"type\" : {\n" +
                "            \"id\" : 302,\n" +
                "            \"code\" : \"03\",\n" +
                "            \"title\" : \"شهر\",\n" +
                "            \"parent\" : {\n" +
                "              \"id\" : 301,\n" +
                "              \"code\" : \"02\",\n" +
                "              \"title\" : \"استان\",\n" +
                "              \"parent\" : {\n" +
                "                \"id\" : 300,\n" +
                "                \"code\" : \"01\",\n" +
                "                \"title\" : \"کشور\",\n" +
                "                \"parent\" : null\n" +
                "              }\n" +
                "            }\n" +
                "          },\n" +
                "          \"parent\" : {\n" +
                "            \"id\" : 130,\n" +
                "            \"code\" : \"07\",\n" +
                "            \"title\" : \" تهران بزرگ\",\n" +
                "            \"description\" : \" تهران بزرگ\",\n" +
                "            \"type\" : {\n" +
                "              \"id\" : 301,\n" +
                "              \"code\" : \"02\",\n" +
                "              \"title\" : \"استان\",\n" +
                "              \"parent\" : {\n" +
                "                \"id\" : 300,\n" +
                "                \"code\" : \"01\",\n" +
                "                \"title\" : \"کشور\",\n" +
                "                \"parent\" : null\n" +
                "              }\n" +
                "            },\n" +
                "            \"parent\" : {\n" +
                "              \"id\" : 1,\n" +
                "              \"code\" : \"0001\",\n" +
                "              \"title\" : \"ايران\",\n" +
                "              \"description\" : \"ايران\",\n" +
                "              \"type\" : {\n" +
                "                \"id\" : 300,\n" +
                "                \"code\" : \"01\",\n" +
                "                \"title\" : \"کشور\",\n" +
                "                \"parent\" : null\n" +
                "              },\n" +
                "              \"parent\" : null,\n" +
                "              \"isDefault\" : null\n" +
                "            },\n" +
                "            \"isDefault\" : null\n" +
                "          },\n" +
                "          \"isDefault\" : null\n" +
                "        }\n" +
                "      }\n" +
                "    },\n" +
                "    \"department\" : null,\n" +
                "    \"fax\" : null,\n" +
                "    \"hireDate\" : null,\n" +
                "    \"homePhone\" : null,\n" +
                "    \"localityName\" : null,\n" +
                "    \"homePostalAddress\" : null,\n" +
                "    \"postalAddress\" : null,\n" +
                "    \"postalCode\" : null,\n" +
                "    \"poBox\" : null,\n" +
                "    \"state\" : null,\n" +
                "    \"street\" : null,\n" +
                "    \"telePhoneNumber\" : null,\n" +
                "    \"title\" : null,\n" +
                "    \"initials\" : null,\n" +
                "    \"pager\" : null,\n" +
                "    \"city\" : null\n" +
                "  }\n" +
                "}";

        stubFor(WireMock.get(urlPathEqualTo("/portal/api/v2.0/users/" + nationalCode + "/info"))
                .willReturn(aResponse()
                        .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                        .withStatus(200)
                        .withBody(mockResponse)));
    }

    default void setupUserAndGetTokenStub(String nationalCode) {
        setupGetTokenStub();
        setupUserStub(nationalCode);
    }
}
