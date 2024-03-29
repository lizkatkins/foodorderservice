package com.lizkatkins.foodorderservice.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.lizkatkins.foodorderservice.model.FoodOrder;
import com.lizkatkins.foodorderservice.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class FoodOrderController {

    private final FoodOrderService foodOrderService;

    @Autowired
    public FoodOrderController(FoodOrderService foodOrderService) {
        this.foodOrderService = foodOrderService;
    }

    @PostMapping
    public String createFoodOrder(@RequestBody FoodOrder foodOrder) throws JsonProcessingException {
        //log.info("create food order request received");
        return foodOrderService.createFoodOrder(foodOrder);
    }
}
