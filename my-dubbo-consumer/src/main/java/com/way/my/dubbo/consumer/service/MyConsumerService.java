package com.way.my.dubbo.consumer.service;

import com.way.my.dubbo.service.MyProducerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MyConsumerService {
    @Resource
    private MyProducerService myProducerService;

    public void testMyService(){
        myProducerService.sayHello("hani");
    }
}
