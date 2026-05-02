package com.LearnSpringBoot.Service;

import com.LearnSpringBoot.Model.Product;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductService {
    List<Product> products = new ArrayList<>(
            Arrays.asList( Arrays.asList(
                    new Product(101, "Iphone", 25000),
                    new Product(102,"cannon", 30000)
            )

            );

    public List<Product> getProducts(){
   return products;
    }
}
