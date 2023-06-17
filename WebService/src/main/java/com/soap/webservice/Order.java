package com.soap.webservice;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Getter
@Setter
public class Order {
    private int id;
    private LocalDateTime date;
    private double cost;
    private Product product;
    private ArrayList<Product> products;
}
