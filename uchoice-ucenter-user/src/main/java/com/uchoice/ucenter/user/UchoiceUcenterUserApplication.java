package com.uchoice.ucenter.user;

import com.uchoice.ucenter.config.db.mysql.DataSourceConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Import;

/**
 * Created by levou on 2017/5/25.
 */
@SpringBootApplication
@Import(DataSourceConfiguration.class)
public class UchoiceUcenterUserApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(UchoiceUcenterUserApplication.class).web(true).run(args);
    }
}
