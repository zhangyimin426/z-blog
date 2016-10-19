package com.zym.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Gavin
 * @date 2016-08-31
 */
@SpringBootApplication
@ServletComponentScan
public class Application{

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

}
