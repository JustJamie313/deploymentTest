package com.domesne.deploymenttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DeploymentTestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DeploymentTestApplication.class, args);
    }

}
