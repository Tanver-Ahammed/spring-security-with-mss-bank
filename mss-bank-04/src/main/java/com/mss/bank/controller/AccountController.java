package com.mss.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccount")
    public String myAccountDetails() {
        return "Here are the Account Details from DB.";
    }

}
