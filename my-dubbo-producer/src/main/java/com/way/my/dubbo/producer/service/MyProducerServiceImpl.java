package com.way.my.dubbo.producer.service;

import com.way.my.dubbo.service.MyProducerService;
import org.springframework.stereotype.Service;

@Service
public class MyProducerServiceImpl implements MyProducerService {
    @Override
    public void sayHello(String message) {
        System.out.println("--- say some hello message to consumer"+message);
    }
}
