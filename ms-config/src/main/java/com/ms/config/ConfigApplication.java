package com.ms.config;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;


/**
 * Created by luoqi on 2016-09-16.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {



    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigApplication.class).web(true).run(args);
    }

}