package com.uchoice.ucenter.config.db.mysql;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/25.
 */
@Configuration
@ComponentScan(value = {"com.uchoice.ucenter"})
@MapperScan(value = {"com.uchoice.ucenter.user.dao.mysql.mapper",
        "com.uchoice.ucenter.role.dao.mysql.mapper",
        "com.uchoice.ucenter.organization.dao.mysql.mapper"})
public class DataSourceConfiguration {
    @Value("${datasource.type}")
    private Class<? extends DataSource> datasourceType;

    @Bean("masterDataSource")
    @Primary
    @ConfigurationProperties(prefix = "datasource.master")
    public DataSource masterDataSource(){
        return DataSourceBuilder.create().type(datasourceType).build();
    }
    @Bean("slaveDataSourceOne")
    @ConfigurationProperties("datasource.slave.one")
    public DataSource slaveDataSourceOne(){
        return DataSourceBuilder.create().type(datasourceType).build();
    }
    @Bean
    @Primary
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(abstractRoutingDataSource());
        return sqlSessionFactoryBean.getObject();
    }
    @Bean
    @DependsOn( value = {"masterDataSource","slaveDataSourceOne"})
    public AbstractRoutingDataSource abstractRoutingDataSource(){
        GenericRoutingDataSource genericRoutingDataSource = new GenericRoutingDataSource();
        genericRoutingDataSource.setDefaultTargetDataSource(masterDataSource());
        Map<Object,Object> dataSources = new HashMap<>();
        dataSources.put(com.uchoice.ucenter.config.db.mysql.DataSourceHolder.DbRouterType.MASTER,masterDataSource());
        dataSources.put(com.uchoice.ucenter.config.db.mysql.DataSourceHolder.DbRouterType.SLAVER,slaveDataSourceOne());
        genericRoutingDataSource.setTargetDataSources(dataSources);
        return genericRoutingDataSource;
    }
}
