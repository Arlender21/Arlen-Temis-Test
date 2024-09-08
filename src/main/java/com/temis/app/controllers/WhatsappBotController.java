package com.temis.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/whatsapp-bot")
public class WhatsappBotController {

    @GetMapping("/ping")
    public String get(){
        return "Hola Mundo";
    }
}
