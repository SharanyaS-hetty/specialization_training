package com.example.shoppingpp.controllers;

import com.example.shoppingpp.Helpers.response;
import com.example.shoppingpp.Helpers.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DB.insertData;
@RestController
@RequestMapping("/auth")
public class registerController {
    @PostMapping("/register")
    public response response(@RequestBody user u)
    {
        return insertData.addUser(u);
    }
    

    
}
