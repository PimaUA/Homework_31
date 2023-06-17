package com.soap.webservice;

import jakarta.xml.ws.Endpoint;

public class OrderServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/orderservice",
                new OrderRepository());
    }
}
