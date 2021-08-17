package com.example.demo.service;

import com.example.demo.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guoyanrui on 2021/8/16
 */
public interface UserService {
    List<User> getAllUser();
    int deleteUser(int id);
    int  insert(int id,String name,String password);
    User selectOne(int id);
    int update(int id,String name,String password);
}
