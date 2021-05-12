package com.xfactor.lably.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.xfactor.lably.entity.Customer;

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

    ArrayList<Customer> customers = new ArrayList<>();

    @PostMapping("/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer){
        customers.add(customer);
        return customer;
    }

    @GetMapping("/getcustomer")
    public ArrayList<Customer> getCustomer(){
        return customers;

    }

    @GetMapping("/searchcustomer")
    public ArrayList<Customer> searchCustomer(@RequestParam String name){

        ArrayList<Customer> cst = new ArrayList<>();
        boolean f = false;

        for(Customer c: customers){
            if(c.getName().equals(name)){
                f = true;
                cst.add(c);
            }              
        }
        if(f==true) return cst;
        else return null;
    }

}