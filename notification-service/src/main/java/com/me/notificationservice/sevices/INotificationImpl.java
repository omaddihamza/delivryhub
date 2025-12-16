package com.me.notificationservice.sevices;

import com.me.notificationservice.entities.Notification;
import com.me.notificationservice.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class INotificationImpl implements INotification {

    private final NotificationRepository notificationRepository;

    public INotificationImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public void addNotification(Notification notification) {
        notificationRepository.save(notification);
    }

    @Override
    public Notification getNotification(Long id) {
        return notificationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Notification not found"));
    }

    @Override
    public List<Notification> getNotifications() {
        return notificationRepository.findAll();
    }
}
