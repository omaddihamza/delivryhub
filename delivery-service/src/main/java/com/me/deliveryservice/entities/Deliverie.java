package com.me.deliveryservice.entities;

import com.me.deliveryservice.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Deliverie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long order_id;
    private long livreur_id;
    private Status status;
}
