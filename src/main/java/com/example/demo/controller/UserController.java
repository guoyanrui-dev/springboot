package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guoyanrui on 2021/8/17
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public List<User> getStaging() {
        return userService.getAllUser();
    }
    @RequestMapping("/add")
    public String addUser(@RequestParam(value = "id") int id,
                        @RequestParam(value = "name") String name,
                        @RequestParam(value = "password") String password) {

        int res = userService.insert(id, name, password);
        if (res > 0) {
            return "增加成功";
        } else {
           return "插入失败";
        }
    }
    @RequestMapping("/delete")
    public String del(@RequestParam(value = "id") int id){
        int  res = userService.deleteUser(id);
        if(res>0){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }
    @RequestMapping("/getUserById")
    public User getUserId(@RequestParam(value = "id") int id) {
        return userService.selectOne(id);
    }
    @RequestMapping("/update")
    public String updateUser(@RequestParam(value = "id") int id,
                          @RequestParam(value = "name") String name,
                          @RequestParam(value = "password") String password) {

        int res = userService.update(id, name, password);
        if (res > 0) {
            return "更新成功";
        } else {
            return "更新失败";
        }
    }
    @RequestMapping("/main")
    public String getmain(  ){
        return "index";
    }
}
