package com.example.railway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping
    public String checkName(){
        return "<h1>Jorge Mario González</h1>";
    }
}
