package com.soap.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import java.util.ArrayList;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface OrderService {

    @WebMethod
    Order getOrderById(int id);

    @WebMethod
    ArrayList<Order> getAllOrders();

    @WebMethod
    Order addOrder(int id, Order order);
}
