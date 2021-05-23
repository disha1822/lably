package com.xfactor.lably.controllers;

import java.util.List;

import com.xfactor.lably.entity.Tests;
import com.xfactor.lably.repository.TestsRepository;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    TestsRepository testrepo;

    @PostMapping("/addtest")
    public Tests addTest(@RequestBody Tests test){
        Tests persistedtest = testrepo.save(test);
        return persistedtest;
    }

    @GetMapping("/gettest")
    public List<Tests> getTest(){
        List<Tests> persistedtests = testrepo.findAll();

        return persistedtests;
    }

    
    @GetMapping("/searchTestByName")
    public Tests searchTest(@RequestParam String name){

        Tests test = testrepo.findByName(name);
        return test;
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
