package com.dell.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class gitController {
    @GetMapping(value = {"/saySome{id}"})
    public String getsome(){
        return "";
    }
}
