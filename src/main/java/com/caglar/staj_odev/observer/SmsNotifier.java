package com.caglar.staj_odev.observer;

public class SmsNotifier implements NotificationObserver {
    public void notifyUser(String message) {
        System.out.println("SMS gönderildi: " + message);
    }
}