package com.example.demo.controller;

import com.example.demo.bean.StagingUser;
import com.example.demo.service.StagingUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guoyanrui on 2021/8/17
 */
@RestController
public class StagingUserController {
    @Autowired
    private StagingUserService stagingUserService;

    @RequestMapping("/staging")
    public List<StagingUser> getStaging() {
        return stagingUserService.getAllUser();
    }
}
