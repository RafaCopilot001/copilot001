package com.mojix;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrderService {

    public boolean createOrder(Order order) {
        return true;
    }
}
