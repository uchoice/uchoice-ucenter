package com.uchoice.ucenter.ui;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by Administrator on 2017/5/24.
 */
@SpringBootApplication
public class UchoiceUcenterUiApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(UchoiceUcenterUiApplication.class).web(true).run(args);
    }
}
