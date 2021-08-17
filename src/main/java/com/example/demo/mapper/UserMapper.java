package com.example.demo.mapper;

import com.example.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author guoyanrui on 2021/8/16
 */
@Mapper
@Component
public interface UserMapper {
    List<User> selectAll();
}
