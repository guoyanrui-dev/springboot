package com.example.demo;

import com.example.demo.bean.HelloWord;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class ApplicationTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.demo.bean");
//        System.out.println("创建成功");
//        HelloWord helloWord = (HelloWord) context.getBean("helloWord");
//        helloWord.out();
        Class clazz = Class.forName("com.example.demo.bean.HelloWord");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        HelloWord helloWord = (HelloWord) clazz.newInstance();
        helloWord.out();


    }



}
