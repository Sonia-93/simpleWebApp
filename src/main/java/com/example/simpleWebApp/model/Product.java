package com.example.simpleWebApp.model;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor; // 👈 Add this import

@Component 
@Data 
@NoArgsConstructor 
public class Product {
    
  private int prodId; 
  private String prodName;
  private int price;

   
   public Product(int prodId, String prodName , int price) {
        this.prodId = prodId;
        this.prodName = prodName;  
        this.price = price;
    }
}
