package com.mss.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/myLoans")
    public String myLoansDetails() {
        return "Here are the Loans Details from DB.";
    }


}
