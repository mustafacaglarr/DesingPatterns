package com.caglar.staj_odev.service;

import com.caglar.staj_odev.decorator.BasicUser;
import com.caglar.staj_odev.decorator.PremiumUserDecorator;
import com.caglar.staj_odev.decorator.UserComponent;
import com.caglar.staj_odev.observer.EmailNotifier;
import com.caglar.staj_odev.observer.NotificationObserver;
import com.caglar.staj_odev.observer.SmsNotifier;
import com.caglar.staj_odev.service.factory.ValidatorFactory;
import com.caglar.staj_odev.service.factory.ValidatorType;
import com.caglar.staj_odev.singleton.AppLogger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistrationService {
    private List<NotificationObserver> observers = new ArrayList<>();

    public RegistrationService() {
        observers.add(new EmailNotifier());
        observers.add(new SmsNotifier());
    }

    public String registerUser(String name, String email, String phone, boolean premium) {
        var logger = AppLogger.getInstance();

        var validator = ValidatorFactory.getValidator(ValidatorType.EMAIL);
        if (!validator.validate(email)) return "Geçersiz email";

        UserComponent user = new BasicUser(name);
        if (premium) user = new PremiumUserDecorator(user);

        logger.log("Kullanıcı kaydedildi: " + user.getDetails());

        for (var obs : observers) {
            obs.notifyUser("Hoşgeldiniz, " + name + "!");
        }

        return "Kayıt başarılı: " + user.getDetails();
    }
}

