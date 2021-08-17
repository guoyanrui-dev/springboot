package com.example.demo.mapper;

import com.example.demo.bean.StagingUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author guoyanrui on 2021/8/17
 */
@Mapper
@Component
public interface StagingUserMapper {
    List<StagingUser> getsUser();
}
