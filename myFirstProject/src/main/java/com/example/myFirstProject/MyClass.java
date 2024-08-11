package com.example.myFirstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyClass {
    @GetMapping("abc")
    String sayHello(){
        return "Hello";
    }
}
