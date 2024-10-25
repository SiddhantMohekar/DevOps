package com.devops.dev.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "hello";
    }
    
}
