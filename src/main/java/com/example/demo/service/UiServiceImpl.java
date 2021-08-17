package com.example.demo.service;

import com.example.demo.bean.Ui;
import com.example.demo.mapper.UiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guoyanrui on 2021/8/16
 */
@Service
public class UiServiceImpl implements UiService {
    @Autowired
    private UiMapper uiMapper;
    @Override
    public List<Ui> getUi() {
        return uiMapper.getAllUi();
    }
}
