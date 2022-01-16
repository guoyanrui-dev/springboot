package com.example.demo.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloWord {
   public void out(){
       System.out.println("helloword");
   }
}
