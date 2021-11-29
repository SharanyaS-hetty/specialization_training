package com.example.shoppingpp.Helpers;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@Data
@Getter
@Setter
@ToString
public class user {
    String uid;
    String name;
    String Email;
    String password;
    String country_code;
    int phone_no;
    List<Object> cart;
    
}
