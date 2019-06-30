package com.arun.springbootsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(1)
public class DigestAuthenticationSecurity extends WebSecurityConfigurerAdapter {
}
