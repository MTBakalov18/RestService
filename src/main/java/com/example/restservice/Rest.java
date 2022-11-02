package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;
@RestController
public class Rest {
    @GetMapping("/home")
    public String home() {
        return "Welcome user";
    }

    @GetMapping("/user")
    public String user() {

        return String.format("User: %s<br>Age:  %s<br>From: %s", "<Вашите имена>", "<Вашите години>", "<Вашият роден град>");
    }

    @GetMapping("/about")
    public String about() {
        return "My name is Martin from Burgas, Bulgaria.";
    }

    @GetMapping("/contact")
    public String contact() {
        return "e-mail address for contact: MTBakalov18@codingburgas.bg";

    }
}

