package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author guoyanrui on 2021/8/16
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getall")
    public List<User> getUser() {
        return userService.getAllUser();
    }
}
