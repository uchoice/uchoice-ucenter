package com.uchoice.ucenter.config.db.mysql;

/**
 * Created by Administrator on 2017/5/25.
 */
public final class DataSourceHolder {
    public enum DbRouterType{
        MASTER,SLAVER
    }
    public static volatile ThreadLocal<DbRouterType> THREAD_LOCAL = new ThreadLocal<>();
    static {
        THREAD_LOCAL.set(DbRouterType.MASTER);
    }
    public static void set(DbRouterType dbRouterType){
        THREAD_LOCAL.set(dbRouterType);
    }

    public static DbRouterType get(){
        return THREAD_LOCAL.get();
    }
}
