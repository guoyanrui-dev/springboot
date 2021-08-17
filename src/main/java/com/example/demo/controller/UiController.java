package com.example.demo.controller;

import com.example.demo.bean.Ui;
import com.example.demo.service.UiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author guoyanrui on 2021/8/16
 */
@RestController
public class UiController {
    @Autowired
    private UiService uiService;

    @RequestMapping("/getUiAll")
    public List<Ui> getUiContent() {
        return uiService.getUi();
    }
}
