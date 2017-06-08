package com.uchoice.ucenter.user.dao.mysql.mapper;

import com.uchoice.ucenter.config.db.mysql.BaseMapper;
import com.uchoice.ucenter.user.dao.mysql.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2017/5/26.
 */
public interface UserMapper extends BaseMapper<User>{
//    @Select("select * from uc_user where user_id in ")
//    List<User> queryUserByIds(@Param("userIds") List<Long> userIds);
}
