package com.dcj.authentication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : DCJ
 * @date : 2023-06-09
 **/
@RestController
@RequestMapping("/authentication")
public class AuthenticationController {

    @GetMapping("/run")
    public void run (){
        System.out.println("x");
    }
}
