package com.example.demo.service;
import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import com.example.demo.exception;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {

    //List<Company> list = new ArrayList<>();

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer addCustomer(Customer customer){


//        companyRepository.save(company);
//        list.add(company);
        return customerRepository.save(customer);

    }


    public Customer getCustomer(long id){
        return customerRepository.findById(id).get();


//        return list.stream()
//                .filter(p->p.getId()==id)
//                .findFirst().orElseThrow(()-> new IllegalArgumentException("not found"));
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(long id)
    {
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent()){
            return customer.get();
        }
        else{
            throw new exception("Customer","Id",id);
        }

        //or we can use lambda expression
        //return companyRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Company","Id",id));

    }

    public Customer updateCustomer(Customer customer,long id)
    {
        //checking if the company with give id exists in the database or not
        Customer existingCustomer = customerRepository.findById(id).orElseThrow(()->new exception("Customer","Id",id));
        existingCustomer.setFname(customer.getFname());
        existingCustomer.setLname(customer.getLname());
        existingCustomer.setGender(customer.getGender());
        existingCustomer.setDateOfBirth(customer.getDateOfBirth());
        existingCustomer.setEmail(customer.getEmail());
        existingCustomer.setPhone(customer.getPhone());
        existingCustomer.setBuildingnumber(customer.getBuildingnumber());
        existingCustomer.setStreetname(customer.getStreetname());
        existingCustomer.setPin(customer.getPin());
        customerRepository.save(existingCustomer);
        return existingCustomer;

    }

    public void deleteCustomer(long id){

        //We have to check if the company exists in the database or not
        customerRepository.findById(id).orElseThrow(()->new exception("Customer","Id",id));
        customerRepository.deleteById(id);
    }

    public void deleteAllCustomers(){
        customerRepository.deleteAll();
    }







}