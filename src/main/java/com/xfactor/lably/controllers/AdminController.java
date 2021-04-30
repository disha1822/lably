package com.xfactor.lably.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.xfactor.lably.entity.Admin;

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

    ArrayList<Admin> admins = new ArrayList<>();

    @PostMapping("/addadmin")
    public Admin addAdmin(@RequestBody Admin admin){
        admins.add(admin);
        return admin;
    }

    @GetMapping("/getadmin")
    public ArrayList<Admin> getAdmin(){
        return admins;

    }

    @GetMapping("/searchadmin")
    public ArrayList<Admin> searchAdmin(@RequestParam String name){

        ArrayList<Admin> ad = new ArrayList<>();
        boolean f = false;

        for(Admin a: admins){
            if(a.getName().equals(name)){
                f = true;
                ad.add(a);
            }              
        }
        if(f==true) return ad;
        else return null;
    }

}