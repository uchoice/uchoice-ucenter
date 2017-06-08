package com.uchoice.ucenter.role.dao.msyql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ${admin} on 2017/5/29.
 */
@Configuration
@MapperScan(value = {"com.uchoice.ucenter.role.dao.mysql.mapper"})
public class UchoiceRoleConfiguration {
}
