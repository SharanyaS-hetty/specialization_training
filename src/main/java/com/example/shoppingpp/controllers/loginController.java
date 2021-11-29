package com.example.shoppingpp.controllers;

import com.example.shoppingpp.Helpers.authLogin;
import com.example.shoppingpp.Helpers.response;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DB.insertData;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/auth")
public class loginController {
    @PostMapping("/login")
    public response login(@RequestBody authLogin credential)
    {
        return insertData.userLogin(credential);
    }

    @GetMapping("/allUsers")
    public response getAllUsers()
    {
        return insertData.userList();
    }

    
}
