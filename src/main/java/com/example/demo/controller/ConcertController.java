package com.example.demo.controller;

import com.example.demo.model.Concert;
import com.example.demo.model.Customer;
import com.example.demo.service.ConcertService;
import com.example.demo.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/concert")

public class ConcertController {

    private final ConcertService concertService;

    public ConcertController(ConcertService concertService) {
        this.concertService = concertService;
    }

//    @PostMapping("/addcustomer")
//
//    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
//
//
//        return new ResponseEntity<Customer>(customerService.addCustomer(customer), HttpStatus.CREATED);
//    }
    //    public void addCompany(@RequestBody Company company){
//        companyService.addCompany(company);
//    }


//    @GetMapping("/{id}")
//    public Company getCompany(@PathVariable(name = "id") int id){
//        return companyService.getCompany(id);
//    }@GetMapping("/all")
//    public List<Company> getAllCompanies(){
//        return companyService.getAllCompanies();
//    }

    //Get all companies rest API
    @GetMapping("/getallconcerts")
    public List<Concert> getAllConcerts() {
        return concertService.getAllConcerts();

    }

    //Get company by ID rest API
    //https://localhost:8080/api/companies/1
    @GetMapping("{id}")
    public ResponseEntity<Concert> getConcertById(@PathVariable("id") long concertid) {
        return new ResponseEntity<Concert>(concertService.getConcertById(concertid), HttpStatus.OK);
    }

}


