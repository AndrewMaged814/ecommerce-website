package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.LogInService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:8081/")
@RequestMapping("/api/customer")

public class LogInController {

    private LogInService logInService;

    public LogInController(LogInService logInService) {
        this.logInService = logInService;
    }

    @PostMapping("/authenticateuser")
    public String AuthenticateCustomer(@RequestBody Customer customer) {
        if (logInService.LogInAuthentication(customer)) {
            return "User Authenticated";

        }
        else
            return "Email or password incorrect. Please try again";
//    public void addCompany(@RequestBody Company company){
//        companyService.addCompany(company);
//    }
    }
}