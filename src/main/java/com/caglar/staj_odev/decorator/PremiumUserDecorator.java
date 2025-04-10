package com.caglar.staj_odev.decorator;


// Decorator sınıfı
public class PremiumUserDecorator implements UserComponent {
    private UserComponent user;

    public PremiumUserDecorator(UserComponent user) {
        this.user = user;
    }

    @Override
    public String getDetails() {
        return user.getDetails() + " (Premium)";
    }
}
