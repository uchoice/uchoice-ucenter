package com.uchoice.ucenter.biz;

import com.uchoice.ucenter.config.db.mysql.DataSourceConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

/**
 * Created by ${admin} on 2017/6/17.
 */
@SpringBootApplication
@Import(value = {DataSourceConfiguration.class})
public class UchoiceUcenterBizApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(UchoiceUcenterBizApplication.class).web(true).run(args);
    }
}
