package com.challenge.challenge1.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.challenge1.Entities.Order;

@Service
public class OrderService {
    
    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        return order.getBasic() - order.getBasic()*(order.getDiscount()/100)
        + shippingService.shipment(order);
    }
}
