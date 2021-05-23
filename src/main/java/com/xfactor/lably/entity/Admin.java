package com.xfactor.lably.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_admin")
public class Admin{

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

   
    private String  username;

    
    private String password;

    @Column(name = "Dept")
    private String department;

    public Long  getId(){
        return id;
    }

    public void  setId(Long id){
        this.id = id;
    }

    public String  getName(){
        return name;
    }

    public void  setName(String name){
        this.name = name;
    }

    public String  getUsername(){
        return username;
    }

    public void  setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void  setPassword(String password){
        this.password = password;
    }

    public String  getDepartment(){
        return department;
    }

    public void  setDepartment(String department){
        this.department = department;
    }
}