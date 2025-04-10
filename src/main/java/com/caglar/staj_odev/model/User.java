package com.caglar.staj_odev.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class User {
    private String name;
    private String email;
    private String phone;
    private boolean premium;
}
