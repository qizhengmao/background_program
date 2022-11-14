package com.example.background_program.controller;

import com.example.background_program.entity.User;
import com.example.background_program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@ResponseBody
public class HelloController {
    @Autowired
    private UserService userService;
    @GetMapping
    public String hello(){
        return "hello xd";
    }
    @GetMapping("/list")
    public List<User> list(){
        System.out.println(userService.list());
        //return userService.list();
        return userService.listAll();
    }

}
