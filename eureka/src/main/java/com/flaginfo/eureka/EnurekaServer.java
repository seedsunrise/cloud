package com.flaginfo.eureka;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
public class EnurekaServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EnurekaServer.class).web(true).run(args);
    }
}