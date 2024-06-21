package hu.bb.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Configuration
@ConfigurationProperties(prefix = "jwt.configuration")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JwtConfiguration {

    private String key;
    private Long expire;
}
