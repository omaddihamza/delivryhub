package com.me.notificationservice.sevices;

import com.me.notificationservice.entities.Notification;

import java.util.List;

public interface INotification {
    void addNotification(Notification notification);
    Notification getNotification(Long id);
    List<Notification> getNotifications();
}
