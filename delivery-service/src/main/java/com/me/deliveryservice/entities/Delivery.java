package com.me.deliveryservice.entities;

import com.me.deliveryservice.enums.Status;
import com.me.deliveryservice.model.Order;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Delivery {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long order_id;
    private long delivery_person_id;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Transient
    private Order order;
}
