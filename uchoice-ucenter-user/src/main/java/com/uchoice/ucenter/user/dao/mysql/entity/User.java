package com.uchoice.ucenter.user.dao.mysql.entity;

import com.uchoice.ucenter.config.db.mysql.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/26.
 * user(用户主表，核心信息、状态信息())
 user_id,user_name_cn,user_name_en,phone(常用电话),email(常用邮箱),status(用户状态，锁定等)，extention(可扩展字段，宽字段)
 */
@Table(name = "uc_user")
public class User extends BaseEntity{
    /**用户ID**/
    @Column(name = "user_id")
    private long userId;
    //用户名
    @Column(name = "user_name")
    private String userName;
    /**用户中文名**/
    @Column(name = "user_name_cn")
    private String userNameCn;
    /**用户英文名**/
    @Column(name = "user_name_en")
    private String userNameEn;
    /**用户手机号**/
    @Column(name = "phone")
    private long phone;
    /**用户邮箱**/
    @Column(name = "email")
    private String email;
    /**用户状态 0：正常**/
    @Column(name = "status")
    private byte status;
    /**扩展字段，JSON格式**/
    @Column(name = "extention")
    private String extention;
    /**创建时间**/
    @Column(name = "create_date")
    private Date createDate;
    /**创建用户ID，如果是注册，则跟自己ID一直**/
    @Column(name = "create_user_id")
    private long createUserId;
    /**修改时间**/
    @Column(name = "modify_date")
    private Date modifyDate;
    /**修改用户ID**/
    @Column(name = "modify_user_id")
    private long modifyUserId;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserNameCn() {
        return userNameCn;
    }

    public void setUserNameCn(String userNameCn) {
        this.userNameCn = userNameCn;
    }

    public String getUserNameEn() {
        return userNameEn;
    }

    public void setUserNameEn(String userNameEn) {
        this.userNameEn = userNameEn;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }
}
