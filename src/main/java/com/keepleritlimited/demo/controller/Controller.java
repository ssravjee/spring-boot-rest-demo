package com.keepleritlimited.demo.controller;

import com.keepleritlimited.demo.repository.Repository;
import com.keepleritlimited.demo.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class Controller {

    @Autowired
    private Repository repository;

    @RequestMapping("/users")
    public List<Users> getUsers() {
        return repository.findAll();
    }
}
