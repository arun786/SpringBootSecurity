package com.arun.springbootsecurity.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "spring.security.user")
@Getter
@Setter
public class SecurityProperties {
    private String name;
    private String password;
    private List<String> roles;
}
