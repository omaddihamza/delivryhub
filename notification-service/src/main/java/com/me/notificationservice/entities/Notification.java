package com.me.notificationservice.entities;

import com.me.notificationservice.enums.Status;
import com.me.notificationservice.enums.Type;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Notification {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long user_id;
    private Type type;
    private String message;
    private Timestamp created_at;
    private Status status;
}
