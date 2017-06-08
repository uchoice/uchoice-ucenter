package com.uchoice.ucenter.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by admin on 2017/5/24.
 */
@SpringBootApplication
public class UchoiceUcenterConfigApplication {

    public static void main(String[] args){

        ApplicationContext context = SpringApplication.run(UchoiceUcenterConfigApplication.class,args);
        String[] beanDefinitions = context.getBeanDefinitionNames();

        for(String str: beanDefinitions){
            System.out.println(str);
        }
    }
}
