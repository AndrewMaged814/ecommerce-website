package com.example.demo.controller;



import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//@CrossOrigin("*")
@RestController
@RequestMapping("/api/customer")
//@CrossOrigin("http://localhost:8081/")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/addcustomer")

    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {


        return new ResponseEntity<Customer>(customerService.addCustomer(customer), HttpStatus.CREATED);
    }
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
    @GetMapping("/getallcustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();

    }

    //Get company by ID rest API
    //https://localhost:8080/api/companies/1
    @GetMapping("{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") long customerId) {
        return new ResponseEntity<Customer>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }


    //
//    @Autowired
//    private CompanyRepository companyRepository;
//
//    @GetMapping
//    public List<Company> getAllCompanyInfo(){
//        return companyRepository.findAll();
//    }

    //Build update company REST API
    @PutMapping("{id}")
    public ResponseEntity<Customer> updateCompany(@PathVariable("id") long id, @RequestBody Customer customer) {
        return new ResponseEntity<Customer>(customerService.updateCustomer(customer, id), HttpStatus.OK);
    }

//Build delete customer REST API

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") long id) {
        //deletes customer from database
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
