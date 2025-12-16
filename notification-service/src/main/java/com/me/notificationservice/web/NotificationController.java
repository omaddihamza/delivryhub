package com.me.notificationservice.web;

import com.me.notificationservice.entities.Notification;
import com.me.notificationservice.sevices.INotification;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotificationController {

    private final INotification iNotification;

    public NotificationController(INotification iNotification) {
        this.iNotification = iNotification;
    }

    @PostMapping("/notification")
    public void addNotification(@RequestBody Notification notification) {
        iNotification.addNotification(notification);
    }

    @GetMapping("/notification/{id}")
    public Notification getNotification(@PathVariable Long id) {
        return iNotification.getNotification(id);
    }

    @GetMapping("/notifications")
    public List<Notification> getNotifications() {
        return iNotification.getNotifications();
    }
}
