package com.caglar.staj_odev.service.strategy;

public class EmailValidation implements ValidationStrategy {
    @Override
    public boolean validate(String value) {
        return value != null && value.contains("@");
    }
}
