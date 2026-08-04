package com.LearnSpringBoot.Service;

import com.LearnSpringBoot.Model.Product;
import org.springframework.stereotype.Service;


import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product(101, "Iphone", 25000),
                    new Product(103, "Android", 25000),
                    new Product(102, "Canon", 30000)
            )
    );

    public List<Product> getProducts(){

        return products;

    }
    public Product getProductById(int prodId){
        return products.stream().filter(p ->p.getProductID()==prodId)
                .findFirst().orElse(new Product(103, "Macromax", 27000));
    }
    ///// Send the Data and Stored in the List
    public void addProduct(Product product){
        products.add(product);
}


}
