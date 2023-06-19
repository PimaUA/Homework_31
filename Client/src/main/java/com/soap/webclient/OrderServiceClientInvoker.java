package com.soap.webclient;

import java.net.MalformedURLException;
import java.net.URL;

public class OrderServiceClientInvoker {

    public static void main(String[] args) throws MalformedURLException, OrderNotFound_Exception {
        URL url = new URL("http://localhost:8080/orderservice?wsdl");

        OrderService_Service orderService_Service
                = new OrderService_Service(url);

        OrderService orderServiceProxy
                = orderService_Service.getOrderRepositoryPort();

        Order order=orderServiceProxy.getOrderById(0);

        ArrayList orders=orderServiceProxy.getAllOrders();
    }
}