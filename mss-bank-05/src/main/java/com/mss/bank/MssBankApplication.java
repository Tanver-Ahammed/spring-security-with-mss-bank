package com.mss.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.mss.bank.repository")
@EntityScan("com.mss.bank")
public class MssBankApplication {

    public static void main(String[] args) {
        SpringApplication.run(MssBankApplication.class, args);
    }

}
