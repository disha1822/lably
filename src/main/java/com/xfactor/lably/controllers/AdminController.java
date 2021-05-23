package com.xfactor.lably.controllers;

import java.util.List;

import com.xfactor.lably.entity.Admin;
import com.xfactor.lably.repository.AdminRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController{

    @Autowired
    AdminRepository adminrepo;

    @PostMapping("/addadmin")
    public Admin addAdmin(@RequestBody Admin admin){
        Admin persistedadmin = adminrepo.save(admin);
        return persistedadmin;
    }

    @GetMapping("/getadmin")
    public List<Admin> getAdmin(){
        List<Admin> persistedadmins = adminrepo.findAll();

        return persistedadmins;
    }

    @GetMapping("/searchAdminByUsername")
    public Admin searchAdmin(@RequestParam String username){

        Admin admin = adminrepo.findByUsername(username);
        return admin;
    }

}