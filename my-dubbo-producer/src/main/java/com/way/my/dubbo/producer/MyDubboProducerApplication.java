package com.way.my.dubbo.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:applicationContext-dubbo.xml"})
public class MyDubboProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyDubboProducerApplication.class, args);
    }

}
