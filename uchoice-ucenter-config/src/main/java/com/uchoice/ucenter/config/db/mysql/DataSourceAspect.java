package com.uchoice.ucenter.config.db.mysql;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/25.
 */
@Order(-1)
@Component
@Aspect
public class DataSourceAspect {
    @Before(value = "execution(* com.uchoice.ucenter.*.dao..*(..))")
    public void masterDataSourceSetter(){
        DataSourceHolder.set(DataSourceHolder.DbRouterType.MASTER);
    }

    public void slaverDataSourceSetter(){
        DataSourceHolder.set(DataSourceHolder.DbRouterType.SLAVER);
    }
}
