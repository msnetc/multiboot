package com.spring.boot.multiboot3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class App3Controller {

    @RequestMapping("/hello4")
    public String hello4() {
        return "hello yao";
    }

}