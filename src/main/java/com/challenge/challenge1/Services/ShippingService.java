package com.challenge.challenge1.Services;

import org.springframework.stereotype.Service;

import com.challenge.challenge1.Entities.Order;

@Service
public class ShippingService {
    
    public double shipment(Order order){
        if (order.getBasic() < 100.00){
            return 20.00;
        }
        if(order.getBasic() < 200.0 ){
            return 12.00;
        }
        else{
            return 0;
        }
    }
}
