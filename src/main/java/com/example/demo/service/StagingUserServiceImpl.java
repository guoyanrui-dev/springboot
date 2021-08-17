package com.example.demo.service;

import com.example.demo.bean.StagingUser;
import com.example.demo.mapper.StagingUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guoyanrui on 2021/8/17
 */
@Service
public class StagingUserServiceImpl implements StagingUserService {
    @Autowired
    private StagingUserMapper stagingUserMapper;
    @Override
    public List<StagingUser> getAllUser() {
        return stagingUserMapper.getsUser();
    }
}
