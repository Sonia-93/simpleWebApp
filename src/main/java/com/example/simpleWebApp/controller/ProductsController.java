 package com.example.simpleWebApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.service.ProductService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
 public class ProductsController { 
   @Autowired 
private ProductService service; 

     @GetMapping ("/products")

      public List<Product>getProducts(){
        return  service.getProducts();
      } 
      @GetMapping("/products/{prodId}")
      public Product getProductById(@PathVariable int prodId) {
          return service.getProductById(prodId);
      }
      @PostMapping("/products")
      public void addProduct(Product prod){
         service.addProduct(prod);
      }
      


 }

   