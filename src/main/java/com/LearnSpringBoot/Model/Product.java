package com.LearnSpringBoot.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
 private int ProductID;
 private String ProductName;
 private int ProductPrice;
}
