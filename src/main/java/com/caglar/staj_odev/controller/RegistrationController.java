package com.caglar.staj_odev.controller;

import com.caglar.staj_odev.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/register")
@RequiredArgsConstructor
public class RegistrationController {

    private final RegistrationService service;

    @PostMapping
    public ResponseEntity<String> register(@RequestBody Map<String, Object> body) {
        String name = (String) body.get("name");
        String email = (String) body.get("email");
        String phone = (String) body.get("phone");
        boolean premium = (boolean) body.getOrDefault("premium", false);

        String result = service.registerUser(name, email, phone, premium);
        return ResponseEntity.ok(result);
    }
}

