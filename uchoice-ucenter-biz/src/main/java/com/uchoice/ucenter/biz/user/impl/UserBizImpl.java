package com.uchoice.ucenter.biz.user.impl;

import com.uchoice.ucenter.biz.user.UserBiz;
import com.uchoice.ucenter.biz.user.vo.UserInfo;
import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/5/29.
 */
@Service
public class UserBizImpl implements UserBiz{
    @Override
    public void addUserInfo(UserInfo userInfo) {
        //
    }

    @Override
    public boolean modifyUserInfo(UserInfo userInfo) {
        return false;
    }

    @Override
    public void deleteUser(long userId) {

    }

    @Override
    public UserInfo login(Byte identityType, String identifier, String credential) {
        return null;
    }
}
