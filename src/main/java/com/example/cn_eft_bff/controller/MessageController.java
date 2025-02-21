package com.example.cn_eft_bff.controller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MessageController {
    
    // @Autowired
    // private 

    @GetMapping("senales/")
    public String getSenales(@RequestParam String param) {
        return param;
    }
    @GetMapping("alertas/")
    public String getAlertas(@RequestParam String param) {
        return param;
    }
    
}
