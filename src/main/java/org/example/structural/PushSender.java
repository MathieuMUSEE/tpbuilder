package org.example.structural;

public class PushSender extends NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Notification : " + message);
    }
}