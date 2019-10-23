package com.kxb.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name ){
        //service层调用远程服务，并且具有负载均衡的功能
        return restTemplate.getForObject("http://service-hi/hi?name="+name,String.class);
    }

}
