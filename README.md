# SpringBootSecurity

## Basic Authentication
    
        package com.arun.springbootsecurity.config;
        
        import org.springframework.context.annotation.Configuration;
        import org.springframework.security.config.annotation.web.builders.HttpSecurity;
        import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
        
        @Configuration
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


the above configuration will allow spring to generate password and the user name will be user.
