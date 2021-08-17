package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guoyanrui on 2021/8/16
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
   private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.selectAll();
    }
    @Override
    public int insert(int id, String name, String password) {
        return userMapper.add(id, name, password);
    }

    @Override
    public User selectOne(int id) {
        return userMapper.selectOne(id);
    }

    @Override
    public int update(int id, String name, String password) {
        return userMapper.update(id,name,password);
    }

    @Override
    public int deleteUser(int id) {
        return userMapper.delete(id);
    }
}
