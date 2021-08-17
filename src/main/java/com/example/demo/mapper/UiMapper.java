package com.example.demo.mapper;

import com.example.demo.bean.Ui;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author guoyanrui on 2021/8/16
 */
@Mapper
@Component
public interface UiMapper {
    List<Ui> getAllUi();
}
