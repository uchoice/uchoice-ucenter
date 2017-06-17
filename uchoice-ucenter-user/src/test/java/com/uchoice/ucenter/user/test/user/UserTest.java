package com.uchoice.ucenter.user.test.user;

import com.uchoice.ucenter.user.UchoiceUcenterUserApplication;
import com.uchoice.ucenter.user.dao.mysql.entity.User;
import com.uchoice.ucenter.user.dao.mysql.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by admin on 2017/5/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UchoiceUcenterUserApplication.class)
public class UserTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void addUserTest(){
        User user = new User();
        user.setUserId(Long.valueOf(21515151));
        user.setEmail("ucenter@uchoice.com");
        user.setPhone(Long.valueOf(1526352415));
        user.setExtention("non extention");
        user.setStatus((byte)2);
        user.setUserNameCn("大王派我来巡山");
        user.setUserNameEn("king send me check mouton");
        user.setCreateDate(new Date());
        user.setCreateUserId(Long.valueOf(21515151));
        user.setModifyDate(new Date());
        user.setModifyUserId(Long.valueOf(21515151));
        userMapper.insert(user);
    }
}
