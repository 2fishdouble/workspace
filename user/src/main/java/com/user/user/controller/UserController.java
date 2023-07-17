package com.user.user.controller;

import com.dcj.authenticationclient.client.IAuthenticationClient;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : DCJ
 * @date : 2023-06-09
 **/
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IAuthenticationClient authenticationClient;

    @GetMapping("/1")
    public void run (){
        authenticationClient.run();
    }
}
