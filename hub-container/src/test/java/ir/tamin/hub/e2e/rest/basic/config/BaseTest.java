package ir.tamin.hub.e2e.rest.basic.config;

import io.qoop.test.e2e.base.app.TestApplication;
import io.qoop.test.e2e.base.config.BaseE2eTest;
import ir.tamin.hub.e2e.rest.basic.security.SecurityService;
import ir.tamin.hub.e2e.rest.stub.SecurityStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 * Created: 5/3/2026 3:25 PM
 */

@ContextConfiguration(classes = {TestApplication.class, SecurityService.class})
public abstract class BaseTest extends BaseE2eTest implements SecurityStub {
    @Autowired
    private SecurityService securityService;

    @Override
    public String getToken() {
        return "";/*securityService.getToken();*/
    }
}