package com.challenge.challenge1.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    
    private Integer code;
    
    private double basic;
    
    private double discount;


}
