package com.example.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {


    private static final Logger log = LoggerFactory.getLogger(MyController.class);

    @GetMapping("/getStudent")
    public String  getOrderDetails(){

        return "Hello From SVC 1";
    }




}
