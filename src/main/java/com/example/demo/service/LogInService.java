package com.example.demo.service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class LogInService{
    private final CustomerRepository customerRepository;
    private final CustomerService customerService;

    public LogInService(CustomerRepository customerRepository, CustomerService customerService) {
        this.customerRepository = customerRepository;
        this.customerService = customerService;
    }



    public boolean LogInAuthentication(Customer customer){
        List <Customer> customers = customerService.getAllCustomers();
        for(int i =0;i<customers.size();i++){
        if((Objects.equals(customer.getEmail(), customers.get(i).getEmail()) && Objects.equals(customer.getPin(), customers.get(i).getPin()))){
            return true;
            }

    }
        return false;
}

}
