package com.nagarro.firstassignment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @GetMapping
public String index()
{
    return "Hello DevOps!!";
}
}
