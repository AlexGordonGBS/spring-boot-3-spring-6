package com.alex.gordon.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" that returns "Hello World!"

    @GetMapping("/")
    public String sayHellp() {
        return "Hello World!!!!";
    }
}
