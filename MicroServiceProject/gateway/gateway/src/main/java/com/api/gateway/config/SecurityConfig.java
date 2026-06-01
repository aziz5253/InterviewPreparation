package com.api.gateway.config;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {

        return http
                .csrf(ServerHttpSecurity.CsrfSpec::disable)   // ✅ disable CSRF
                .authorizeExchange(exchange -> exchange
                        .pathMatchers("/auth/**").permitAll()   // ✅ allow login
                        .anyExchange().permitAll()
                )
                .build();
    }

}