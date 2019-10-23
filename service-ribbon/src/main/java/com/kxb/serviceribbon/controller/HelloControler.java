package com.kxb.serviceribbon.controller;

import com.kxb.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;

    @GetMapping("/hi")
    public String hi(@RequestParam("name")String name){
        //调用service层
        return helloService.hiService(name);
    }
}
