package com.uchoice.ucenter.user.service;

import com.uchoice.ucenter.user.dao.mysql.entity.User;

import java.util.List;

/**
 * Created by levou on 2017/5/29.
 */
public interface UserService {
    void addUser(User user);

    void modifyUser(User user);

    User queryUserById(long userId);

    List<User> queryUserByIds(long ... userIds);

    List<User> queryUserByIds(List<Long> userIds);

    void deleteUserById(long userId);
}
