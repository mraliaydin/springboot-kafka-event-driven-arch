package com.aliaydin.basedomains.dto;

import lombok.*;

// @Data is for getter/setter/toString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private String orderId;
    private String name;
    private int qty;
    private double price;

}
