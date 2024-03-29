package com.lizkatkins.foodorderservice.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lizkatkins.foodorderservice.appconfig.Producer;
import com.lizkatkins.foodorderservice.model.FoodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodOrderService {

    private final Producer producer;

    @Autowired
    public FoodOrderService(Producer producer) {
        this.producer = producer;
    }

    public String createFoodOrder(FoodOrder foodOrder) throws JsonProcessingException {
        return producer.sendMessage(foodOrder);
    }
}
