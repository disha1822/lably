## Prerequisites
- Install Git (https://git-scm.com/download/)
- Install Java 8 (https://adoptopenjdk.net/index.html?variant=openjdk8&jvmVariant=hotspot)
- new Test line 

## 1. How to start
```
$ git clone https://github.com/crkarthik11/lably.git
$ cd lably
$ ./gradlew
$ ./gradlew bootRun
$ curl -v localhost:8080
```

## Entities to create

### Lab
 - String name
 - String address
 - String phone
 - String pincode

 ### Tests
 - String name
 - String description
 - Double price


### Admin
 - String name
 - String  username
 - String  password
 
### Customer
 - String name
 - String address
 - String age
 - String gender


## APIs 

### Admin controller
 - Add Admin (POST) 
 - List of admins - Must return 5 admin objects (GET)
 - Api to return single admin by username (GET)

### Lab controller
 - Add Lab (Post)
 - List of labs - Must return 5 labs in list (GET)
 - Api to return single lab by name (GET)

### Test controller
 - Add Test (Post)
 - List of Test - Must return 5 Test in list (GET)
 - Api to return single Test by name (GET)

### Customer controller
 - Add Customer (Post)
 - List of Customer - Must return 5 Customer in list (GET)
 - Api to return single Customer by username (GET)

 
### Refs
 - How to create a new project : https://start.spring.io/
 - Spring Docs : https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/

