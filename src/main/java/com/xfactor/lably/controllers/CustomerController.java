package com.xfactor.lably.controllers;

import java.util.List;

import com.xfactor.lably.entity.Customer;
import com.xfactor.lably.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController{

    @Autowired
    CustomerRepository customerrepo;

    @PostMapping("/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        Customer persistedcustomer = customerrepo.save(customer);
        return persistedcustomer;
    }

    @GetMapping("/getcustomer")
    public List<Customer> getCustomer(){
        List<Customer> persistedcustomers = customerrepo.findAll();
        return persistedcustomers;

    }

    @GetMapping("/searchCustomerByName")
    public Customer searchCustomer(@RequestParam String name){

        Customer cust = customerrepo.findByName(name);
        return cust;
    }

}