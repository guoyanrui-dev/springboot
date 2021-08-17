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
    int delete(int id);
    int add(int id,String name,String password);
    User selectOne(int id);
    int update(int id,String name,String password);
}
