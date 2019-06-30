package com.arun.springbootsecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/homes/v1/home")
    public ResponseEntity<String> homeController() {
        return ResponseEntity.ok("Arun");
    }

}
