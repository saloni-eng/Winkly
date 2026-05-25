package com.example.demo;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "deals")
public class Deal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String productName;
    private String storeName;
    private double normalPrice;
    private double discountPrice;

    public Deal(){}

    public Deal(String productName, String storeName, double normalPrice, double discountPrice) {
        this.productName = productName;
        this.storeName = storeName;
        this.normalPrice = normalPrice;
        this.discountPrice = discountPrice;
    }

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getStoreName() {
        return storeName;
    }

    public double getNormalPrice() {
        return normalPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setNormalPrice(double normalPrice) {
        this.normalPrice = normalPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
