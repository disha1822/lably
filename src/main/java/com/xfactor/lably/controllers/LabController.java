package com.xfactor.lably.controllers;

import java.util.List;


import com.xfactor.lably.entity.Lab;
import com.xfactor.lably.repository.LabRepository;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    LabRepository labrepo;

    @PostMapping("/addlab")
    public Lab addLab(@RequestBody Lab lab) {
        Lab persistedlab = labrepo.save(lab);
        return persistedlab;
    }

    @GetMapping("/getlab")
    public List<Lab> getLab() {
        List<Lab> persistedlabs = labrepo.findAll();
        return persistedlabs;
    }

    @GetMapping("/searchLabByName")
    public Lab searchLab(@RequestParam String name){

        Lab lab = labrepo.findByName(name);
        return lab;
    }
}