package com.me.deliveryservice.services;

import com.me.deliveryservice.entities.Delivery;
import com.me.deliveryservice.repository.DeliveryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDeliveryImpl implements IDelivery {

    private final DeliveryRepository deliveryRepository;

    public IDeliveryImpl(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @Override
    public void save(Delivery deliverie) {
        deliveryRepository.save(deliverie);
    }

    @Override
    public Delivery findId(Long id) {
        return deliveryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No delivery found with id: " + id));
    }

    @Override
    public List<Delivery> findAll() {
        return deliveryRepository.findAll();
    }
}
