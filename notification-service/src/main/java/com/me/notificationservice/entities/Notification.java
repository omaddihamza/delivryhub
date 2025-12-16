package com.me.notificationservice.entities;

import com.me.notificationservice.enums.Status;
import com.me.notificationservice.enums.Type;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
@ToString
public class Notification {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long user_id;
   @Enumerated(EnumType.STRING)
    private Type type;
   @Enumerated(EnumType.STRING)
    private Status status;
    private String message;
    private Timestamp created_at;

}
