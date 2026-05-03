package com.LearnSpringBoot.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

//@Data
//@AllArgsConstructor
@Component
public class Product {
    private int ProductID;
    private String ProductName;
    private int ProductPrice;

    public Product(String productName, int productPrice, int productID) {
        ProductName = productName;
        ProductPrice = productPrice;
        ProductID = productID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int productPrice) {
        ProductPrice = productPrice;
    }

    public Product(int productID) {
        ProductID = productID;
    }
}
