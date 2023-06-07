package com.mss.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableJpaRepositories("com.mss.bank.repository")
@EntityScan("com.mss.bank")
@EnableMethodSecurity(securedEnabled = true, jsr250Enabled = true)
public class MssBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(MssBankApplication.class, args);
    }

}
