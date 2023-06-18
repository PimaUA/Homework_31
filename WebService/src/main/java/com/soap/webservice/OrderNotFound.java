package com.soap.webservice;

import jakarta.xml.ws.WebFault;

@WebFault
public class OrderNotFound extends Exception {

    public OrderNotFound() {
        super("The specified order does not exist");
    }
}
