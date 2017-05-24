package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//此注解会从当前包向下扫描注解，因此Main Class尽量放在根目录，比如com.spring.boot，或com.spring，这样可以保证所有包都能被扫描到
@SpringBootApplication
//如果把该Main Class所在包放在WebConfig.class之上，比如com.spring.boot，就不需要@Import了
public class App {

    public static void main(String[] args){

        SpringApplication.run(App.class, args);
    }

}