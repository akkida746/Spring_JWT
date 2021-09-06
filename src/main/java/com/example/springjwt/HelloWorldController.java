package com.example.springjwt;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class HelloWorldController {

    @RequestMapping({ "/hello" })
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/details")
    //@PreAuthorize("hasRole('ADMIN')")
    public String getProjectDetail(){
        return "This is personal project";
    }

}

