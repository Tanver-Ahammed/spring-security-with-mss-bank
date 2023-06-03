package com.mss.bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class ProjectSecurityConfig {

    /**
     * Configuration Customer http requests
     */
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("myAccount", "myBalance", "myCards", "myLoans").authenticated()
                        .requestMatchers("contact", "notices", "welcome", "/register").permitAll())
                .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults());
        return http.build();
    }

    /*@Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        *//**
     * Approach-1 where we use User.withDefaultPasswordEncoder() method
     * *//*
     *//*UserDetails admin = User.withDefaultPasswordEncoder()
                .username("Tanver")
                .password("12345")
                .authorities("ADMIN")
                .build();
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("Aminul")
                .password("12345")
                .authorities("NORMAL")
                .build();
        return new InMemoryUserDetailsManager(admin, user);*//*

     */

    /**
     * Approach-2 where we use NoOpPasswordEncoder() method
     *//*
        UserDetails admin = User
                .withUsername("Tanver")
                .password("12345")
                .authorities("ADMIN")
                .build();
        UserDetails user = User
                .withUsername("Aminul")
                .password("12345")
                .authorities("NORMAL")
                .build();
        return new InMemoryUserDetailsManager(admin, user);
    }*/

//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource) {
//        return new JdbcUserDetailsManager(dataSource);
//    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
