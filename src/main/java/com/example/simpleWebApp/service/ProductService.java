package com.example.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays; // Added import
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service; // Added import
import com.example.simpleWebApp.model.Product;

@Service 
@Component  
public class ProductService {
     
   
    // List<Product> products =new ArrayList<> (Arrays.asList(
    //     new Product(101, "Iphone", 50000),
    //     new Product(102, "Samsung", 40000),
    //     new Product(103, "OnePlus", 30000)
    // ));
      
    // public List<Product> getProducts() {
    //     return products; 
    // }
    // public Product getProductById(int prodId){
    //       return products.stream()
    //       .filter(p->p.getProdId()==prodId)
    //         .findFirst().get(); 

    // }
    //  public void addProduct(Product prod){
    //      products.add(prod);
    //  }
     List <Product> products= new ArrayList<>(Arrays.asList(
      new Product(101,"Iphone",50000),
      new Product(102,"Samsung",40000), 
       new Product(103,"OnePlus",30000)))   ;
     public  List<Product> getProducts(){ 

        return products; 
     }
    public Product getProductById(int prodId){
        return products.stream()
        .filter(p->p.getProdId()==prodId)
        .findFirst().get();
    }
    public void addProduct(Product prod){
        products.add(prod);
    }
} 
