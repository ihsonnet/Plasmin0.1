package com.CRUDProject.Plasmin01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DonorController {
    @GetMapping(value = "/")
    public String test(){
        return "Hello Spring Boot";
    }
}
