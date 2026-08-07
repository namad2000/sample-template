package ir.tamin.hub.e2e.rest.basic.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Configuration class for reading authentication properties.
 * Maps properties with prefix 'auth' to this class.
 */

@Setter
@Getter
@Component
@ConfigurationProperties(prefix = "auth")
public class AuthConfigProperties {

    private String tokenUrl;
    private String username;
    private String password;
    private String clientId;
    private String clientSecret;
}