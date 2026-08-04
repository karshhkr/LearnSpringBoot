package com.LearnSpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
@RequestMapping ("/login")
public String login (){
    System.out.println("logging is called");
return "LoginPage is called";
}
}
