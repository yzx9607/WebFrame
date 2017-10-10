package com.yang.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "helloworld";
    }
    @RequestMapping("/user")
    public Map getUsers() {
        Map map = new HashMap<>();
        map.put("name","fangxiao");
        map.put("age","15");
        return map;
    }
}
