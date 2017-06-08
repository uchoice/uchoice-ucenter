package com.uchoice.ucenter.biz.user.vo;

import com.uchoice.ucenter.user.dao.mysql.entity.User;
import com.uchoice.ucenter.user.dao.mysql.entity.UserPassport;
import com.uchoice.ucenter.user.dao.mysql.entity.UserRelationInfo;

import java.io.Serializable;

/**
 * Created by admin on 2017/5/29.
 */
public class UserInfo implements Serializable{
    private User user;
    private UserPassport userPassport;
    private UserRelationInfo userRelationInfo;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserPassport getUserPassport() {
        return userPassport;
    }

    public void setUserPassport(UserPassport userPassport) {
        this.userPassport = userPassport;
    }

    public UserRelationInfo getUserRelationInfo() {
        return userRelationInfo;
    }

    public void setUserRelationInfo(UserRelationInfo userRelationInfo) {
        this.userRelationInfo = userRelationInfo;
    }
}
