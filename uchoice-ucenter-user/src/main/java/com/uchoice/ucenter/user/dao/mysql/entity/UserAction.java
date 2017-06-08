package com.uchoice.ucenter.user.dao.mysql.entity;

import com.uchoice.ucenter.config.db.mysql.BaseEntity;

import javax.persistence.Table;

/**
 * user_action（用户行为记录：登录/登出、系统操作等）
 * Created by Administrator on 2017/5/26.
 */
@Table(name = "uc_user_action")
public class UserAction extends BaseEntity{
}
