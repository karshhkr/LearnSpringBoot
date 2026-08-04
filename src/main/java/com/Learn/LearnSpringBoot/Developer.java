package com.Learn.LearnSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    @Autowired//Spring se required object ko kisi class me inject karna.
   private Laptop laptop;

    public void build(){

        laptop.compile();
        System.out.println("working on springboot project ");
    }
}
