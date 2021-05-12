package com.xfactor.lably.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.xfactor.lably.entity.Tests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    ArrayList<Tests> tests = new ArrayList<>();

    @PostMapping("/addtest")
    public Tests addTest(@RequestBody Tests test){
        tests.add(test);
        return test;
    }

    @GetMapping("/gettest")
    public ArrayList<Tests> getTest(){
        return tests;

    }
    @GetMapping("/searchtest")
    public ArrayList<Tests> searchTest(@RequestParam String name){

        ArrayList<Tests> tst = new ArrayList<>();
        boolean f = false;

        for(Tests t: tests){
            if(t.getName().equals(name)){
                f = true;
                tst.add(t);
            }              
        }
        if(f==true) return tst;
        else return null;
    }

    
    /*
    // @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String hello() {
        return "Greetings from XFACTOR!!!";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Greetings from " + name + "!!!";
    }

    @GetMapping("/hello2")
    public String helloName2(@RequestParam String name, @RequestParam String age) {
        return "Greetings from hello2 " + name + "!!!" + age;
    }

    @GetMapping("/hello3")
    public Map<String, String> helloName3(@RequestParam String name, @RequestParam String age) {
        Map<String, String> respoMap = new HashMap<>();
        respoMap.put("name", name);
        respoMap.put("age", age);
        return respoMap;
    }

    @GetMapping("/hello4")
    public ArrayList helloName4(@RequestParam String name, @RequestParam String age) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(name);
        arrayList.add(age);
        return arrayList;
    }

    @GetMapping("/getLabs")
    public ArrayList<Lab> getLabs() {
        return labs;
    }

    @PostMapping("/addLab")
    public Lab addLab(@RequestBody Lab lab) {
        String name = lab.getName();
        name = "Hello " + name;
        lab.setName(name);
        labs.add(lab);
        return lab;
    }
    */

}
