package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addcustomer")

    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {


        return new ResponseEntity<Customer>(customerService.addCustomer(customer), HttpStatus.CREATED);
    }

    //Get all customers rest API
    @GetMapping("/getallcustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();

    }

    //Get customers by ID rest API
    //https://localhost:8080/api/customers/1
    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") long customerId) {
        return new ResponseEntity<Customer>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }


    //Build update customers REST API
    @PutMapping("{id}")
    public ResponseEntity<Customer> updateCompany(@PathVariable("id") long id, @RequestBody Customer customer) {
        return new ResponseEntity<Customer>(customerService.updateCustomer(customer, id), HttpStatus.OK);
    }

//Build delete customers REST API

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id) {
        //deletes customers from database
        customerService.deleteCustomer(id);
        return new ResponseEntity<String>("Customer deleted successfully!.", HttpStatus.OK);
    }

//Build delete all customers REST API

    @DeleteMapping
    public ResponseEntity<String> deleteAllCustomers() {
        customerService.deleteAllCustomers();
        return new ResponseEntity<String>("All customers successfully deleted", HttpStatus.OK);
    }

}
