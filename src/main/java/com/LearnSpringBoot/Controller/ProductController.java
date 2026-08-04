package com.LearnSpringBoot.Controller;

import com.LearnSpringBoot.Model.Product;
import com.LearnSpringBoot.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
@GetMapping("/products")
    public List<Product> getProduct(){

        return service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
return service.getProductById(prodId);
    }
@PostMapping ("/products")
public void addProduct(@RequestBody Product product){
    System.out.println(product);
service.addProduct(product);
}
}
