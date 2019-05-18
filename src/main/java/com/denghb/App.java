package com.denghb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class App {


    public static void main(String[] args) {
        ApplicationContext app = SpringApplication.run(App.class, args);
        System.out.println("Hello World!");

        app.getBean(TestService.class).output();
    }


}
