package com.lizkatkins.foodorderservice.model;

import jakarta.persistence.*;

@Entity
public class FoodOrder {

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public FoodOrder(String item, Double amount) {
        this.item = item;
        this.amount = amount;
    }

    public FoodOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String item;
    @Column
    Double amount;

    public String toString() {
        return "{\n" +
                "  \"item\": \""+ item +"\",\n" +
                "  \"amount\": "+ amount +"\n" +
                "}";
    }
}
