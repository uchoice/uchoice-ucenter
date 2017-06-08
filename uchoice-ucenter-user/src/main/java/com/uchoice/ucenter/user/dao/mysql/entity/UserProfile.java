package com.uchoice.ucenter.user.dao.mysql.entity;

import com.uchoice.ucenter.config.db.mysql.BaseEntity;

import javax.persistence.Table;

/**
 * user_profile(用户基本信息，做扩展，联系信息、教育背景、兴趣信息、职业信息等、地域信息)
 * Created by Administrator on 2017/5/26.
 */
@Table(name = "uc_user_profile")
public class UserProfile extends BaseEntity{

}
