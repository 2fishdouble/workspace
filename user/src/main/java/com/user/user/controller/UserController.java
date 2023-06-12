package com.user.user.controller;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : DCJ
 * @date : 2023-06-09
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/1")
    public void run (){
        System.out.println("x");
    }
}
