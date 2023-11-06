package com.github.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/v1/ping")

public class PingController {

    @Value("${bot.token}")
    String botToken;

    @Value("${ecb.eurofxref-daily-xml-url}")
    String eurofxref;

    @GetMapping
    public String ping() {
        return botToken + ": " + eurofxref;
    }
}