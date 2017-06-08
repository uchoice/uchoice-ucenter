package com.uchoice.ucenter.user;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * 姓名  花名  工号 部门  职位 行政岗位 岗位级别  所属序列 职级 生日  性别 政治面貌
     联系手机  联系座机  企业邮箱 私人邮箱 QQ 微信 工作位置  个性签名

     user(用户主表，核心信息、状态信息())
        user_id,user_name_cn,user_name_en,phone(常用电话),email(常用邮箱),status(用户状态，锁定等)，extention(可扩展字段，宽字段)
     user_relation_info(用户关系信息，包含属于哪个组织、什么角色、打标等)
        user_id,org_id,role_ids,tags,extention;
     user_profile(用户基本信息，做扩展，联系信息、教育背景、兴趣信息、职业信息等、地域信息)
     user_passport（用户登录凭证表，实现快速登录，字段尽量少）
     id,user_id,identity_type,identifier,credential,enable
        用户id  凭证类型(用户名/手机/邮箱等)，凭证，凭证密码,是否可用
     user_action（用户行为记录：登录/登出、系统操作等）
     */
}
