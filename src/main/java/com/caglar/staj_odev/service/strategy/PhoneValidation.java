package com.caglar.staj_odev.service.strategy;

public class PhoneValidation implements ValidationStrategy {
    @Override
    public boolean validate(String value) {
        return value != null && value.matches("\\d{10}");
    }
}
