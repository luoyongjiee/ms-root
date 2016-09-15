package com.ms.discover;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by luoqi on 2016-09-15.
 */
@EnableEurekaServer
@SpringBootApplication
public class DiscoverApplication {
    public static void main(String[] args) {
       new SpringApplicationBuilder(DiscoverApplication.class).web(true).run(args);
    }
}
