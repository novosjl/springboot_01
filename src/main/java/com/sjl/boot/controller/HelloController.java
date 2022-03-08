package com.sjl.boot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/user")
    public String user01(){
        return "hello, come to springboot !获取";
    }

    @PostMapping("/user")
    public String user02(){
        return "hello, come to springboot !保存";
    }
    @PutMapping("/user")
    public String user03(){
        return "hello, come to springboot !修改";
    }
    @DeleteMapping("/user")
    public String user04(){
        return "hello, come to springboot !删除";
    }
}
