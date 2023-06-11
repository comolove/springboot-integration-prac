package com.example.integrationPrac.controller;

import com.example.integrationPrac.domain.PracDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("hello")
    public PracDTO hello(){
        return new PracDTO("Hello");
    }
}
