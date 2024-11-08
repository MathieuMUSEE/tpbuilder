package org.example.structural;

public class SMSSender extends NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SMS : " + message);
    }
}