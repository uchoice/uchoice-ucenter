package com.uchoice.ucenter.biz.user;

import com.uchoice.ucenter.biz.user.vo.UserInfo;

/**
 * Created by admin on 2017/5/29.
 */
public interface UserBiz {

    void addUserInfo(UserInfo userInfo);

    boolean modifyUserInfo(UserInfo userInfo);

    void deleteUser(long userId);

    UserInfo login(Byte identityType,String identifier,String credential);
}
