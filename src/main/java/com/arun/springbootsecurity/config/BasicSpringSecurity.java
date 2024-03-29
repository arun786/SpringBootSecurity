package com.arun.springbootsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(3)
public class BasicSpringSecurity extends WebSecurityConfigurerAdapter {

    /**
     * @param http
     * @throws Exception Configuration to use basic authentication, default is both form and login.
     *                   <p>
     *                   When basic is used password is generated by spring
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }
}
