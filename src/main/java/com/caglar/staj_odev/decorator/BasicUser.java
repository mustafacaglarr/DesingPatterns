package com.caglar.staj_odev.decorator;

// ConcreteComponent sınıfı
public class BasicUser implements UserComponent {
    private String name;

    public BasicUser(String name) {
        this.name = name;
    }

    @Override
    public String getDetails() {
        return "Kullanıcı: " + name;
    }
}
