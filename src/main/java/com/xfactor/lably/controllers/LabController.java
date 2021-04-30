package com.xfactor.lably.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


import com.xfactor.lably.entity.Lab;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lab")
public class LabController {


    ArrayList<Lab> labs = new ArrayList<>();

    @GetMapping("/getlab")
    public ArrayList<Lab> getAdmin() {
        return labs;
    }

    @PostMapping("/addlab")
    public Lab addLab(@RequestBody Lab lab) {

        labs.add(lab);
        return lab;
    }

    @GetMapping("/searchlab")
    public ArrayList<Lab> searchLab(@RequestParam String name){

        ArrayList<Lab> ad = new ArrayList<>();
        boolean f = false;

        for(Lab a: labs){
            if(a.getName().equals(name)){
                f = true;
                ad.add(a);
            }              
        }
        if(f==true) return ad;
        else return null;
    }
}