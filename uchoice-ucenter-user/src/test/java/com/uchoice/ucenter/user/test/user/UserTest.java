package com.uchoice.ucenter.user.test.user;

import com.uchoice.ucenter.user.UchoiceUcenterUserApplication;
import com.uchoice.ucenter.user.dao.mysql.entity.User;
import com.uchoice.ucenter.user.service.UserService;
import com.uchoice.ucenter.user.service.mysql.MysqlUserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by admin on 2017/5/29.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UchoiceUcenterUserApplication.class)
public class UserTest {
    @Autowired
    private UserService userService;
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
        userService.addUser(user);
    }
    @Test
    public void modifyUser(){
        User user = new User();
        user.setUserId(Long.valueOf(21515151));
        user.setEmail("ucenter@uchoice.com");
        user.setPhone(Long.valueOf(1526352415));
        user.setExtention("modify extention test");
        user.setStatus((byte)3);
        user.setUserNameCn("大王派我来巡山");
        user.setUserNameEn("king send me check mouton");
        userService.modifyUser(user);
    }
    @Test
    public void deleteUser(){
        userService.deleteUserById(Long.valueOf(21515151));
    }
}
