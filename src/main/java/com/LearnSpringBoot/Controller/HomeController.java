package com.LearnSpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
@RequestMapping("/") // Url Mapping
    public String greet(){
    System.out.println("Showing The Logs To You: ");
        return("hello Aliens");
    }
    @RequestMapping("/about")
     public String about(){
    return ("We're Learning : ");
     }
}
