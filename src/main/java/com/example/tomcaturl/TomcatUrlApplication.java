package com.example.tomcaturl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ServletComponentScan("com.example.tomcaturl.filter")
public class TomcatUrlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TomcatUrlApplication.class, args);
    }

}
