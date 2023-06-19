package com.soap.webservice;

import jakarta.jws.WebService;

import java.time.LocalDate;
import java.util.ArrayList;

@WebService(endpointInterface = "com.soap.webservice.OrderService", serviceName = "OrderService")
public class OrderRepository implements OrderService {
    private final ArrayList<Order> ordersList;
    Order order;

    public OrderRepository() {
        ordersList = new ArrayList<>();
        ordersList.add(new Order(1, LocalDate.of(2023, 6, 12), 170));
        ordersList.add(new Order(2, LocalDate.of(2023, 6, 15), 170));
        ordersList.add(new Order(3, LocalDate.of(2023, 6, 14), 170));
    }

    @Override
    public Order getOrderById(int id) throws OrderNotFound {
        for (Order eachOrder : ordersList) {
            if (eachOrder.getId() == id) {
                return eachOrder;
            }
        }
        throw new OrderNotFound();
    }

    @Override
    public ArrayList<Order> getAllOrders() {
        return ordersList;
    }

    @Override
    public Order addOrder(Order order) {
        ordersList.add(order);
        return order;
    }
}
