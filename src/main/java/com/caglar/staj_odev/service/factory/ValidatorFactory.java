package com.caglar.staj_odev.service.factory;

import com.caglar.staj_odev.service.strategy.*;

public class ValidatorFactory {
    public static ValidationStrategy getValidator(ValidatorType type) {
        return switch (type) {
            case EMAIL -> new EmailValidation();
            case PHONE -> new PhoneValidation();
        };
    }
}
