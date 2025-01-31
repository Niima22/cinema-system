package com.idld.cinema.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home") // ✅ Add base path to avoid conflict with UserController
public class HomeController {

    @GetMapping
    public String homeControllerHandler() {
        return "Cinema microservice for cinema reservation system";
    }
}
