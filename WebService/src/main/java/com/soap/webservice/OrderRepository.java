package com.soap.webservice;

import jakarta.jws.WebService;

import java.util.ArrayList;

@WebService(endpointInterface = "com.soap.webservice.OrderService",serviceName = "OrderService")
public class OrderRepository implements OrderService{
    private ArrayList<Order> orders;

    @Override
    public Order getOrderById(int id) {
        return null;
    }

    @Override
    public ArrayList<Order> getAllOrders() {
        return null;
    }

    @Override
    public Order addOrder(int id, Order order) {
        return null;
    }
}
