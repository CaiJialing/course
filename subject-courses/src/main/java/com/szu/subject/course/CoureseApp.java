package com.szu.subject.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class CoureseApp 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(CoureseApp.class,args);
    }
}