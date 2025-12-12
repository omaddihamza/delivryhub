package com.me.deliveryservice.services;



import com.me.deliveryservice.entities.Delivery;

import java.util.List;

public interface IDelivery {
    void save(Delivery deliverie);
    Delivery findId(Long id);
    List<Delivery> findAll();
}
