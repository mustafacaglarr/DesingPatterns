package com.caglar.staj_odev.observer;

public class EmailNotifier implements NotificationObserver {
    public void notifyUser(String message) {
        System.out.println("Email gönderildi: " + message);
    }
}
