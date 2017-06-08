package com.uchoice.ucenter.user.dao.mysql.entity;

import com.uchoice.ucenter.config.db.mysql.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 *  user_passport（用户登录凭证表，实现快速登录，字段尽量少）
 id,user_id,identity_type,identifier,credential,enable
 用户id  凭证类型(用户名/手机/邮箱等)，凭证，凭证密码,是否可用
 * Created by Administrator on 2017/5/26.
 */
@Table(name = "uc_user_passport")
public class UserPassport extends BaseEntity{
    /**用户ID**/
    @Column(name = "user_id")
    private long userId;
    /**凭证类型 0：用户名 1：手机号 2：邮箱 3：第三方QQ  4：第三方微信,,,,**/
    @Column(name = "identity_type")
    private byte identityType;
    /**凭证**/
    @Column(name = "identifier")
    private String identifier;
    /**凭证tocken/密码**/
    @Column(name = "credential")
    private String credential;
    /**是否可用 0：禁用登陆  1：启用登陆**/
    @Column(name = "enable")
    private boolean enable;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public byte getIdentityType() {
        return identityType;
    }

    public void setIdentityType(byte identityType) {
        this.identityType = identityType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
