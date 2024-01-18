package com.example.threelayerarch;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreeLayerArchApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(ThreeLayerArchApplication.class, args);
        StringService service = applicationContext.getBean(StringService.class);
        System.out.println(service);
    }

}
