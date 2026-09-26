package com.jatin;

public class UserProfile {

    private NotificationService service;

    public void setNotificationService(NotificationService service) {
        this.service = service;
    }

    public void sendNotification() {
        service.sendNotification();
    }
}