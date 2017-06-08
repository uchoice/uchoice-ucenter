package com.uchoice.ucenter.user.dao.mysql.entity;

import com.uchoice.ucenter.config.db.mysql.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 *  user_relation_info(用户关系信息，包含属于哪个组织、什么角色、打标等)
     user_id,org_id,role_ids,tags,extention;
 * Created by Administrator on 2017/5/26.
 */
@Table(name = "uc_user_relation_info")
public class UserRelationInfo extends BaseEntity{
    /**用户ID**/
    @Column(name = "user_id")
    private long userId;
    /**组织ID**/
    @Column(name = "org_id")
    private long orgId;
    /**角色ID**/
    @Column(name = "role_ids")
    private String roleIds;
    /**标签 JSON(List<Long></>)**/
    @Column(name = "tags")
    private String tags;
    /**扩展字段**/
    @Column(name = "extention")
    private String extention;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getOrgId() {
        return orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }
}
