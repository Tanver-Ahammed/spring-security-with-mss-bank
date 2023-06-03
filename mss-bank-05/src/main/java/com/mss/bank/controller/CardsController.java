package com.mss.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCards")
    public String myCardsDetails() {
        return "Here are the Cards Details from DB.";
    }

}
