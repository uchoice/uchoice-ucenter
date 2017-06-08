package com.uchoice.ucenter.role.dao.msyql.entity;

import com.uchoice.ucenter.config.db.mysql.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * 角色
 * Created by admin on 2017/5/29.
 */
@Table(name = "uc_role")
public class Role extends BaseEntity {
    /**
     * 角色ID
     **/
    @Column(name = "role_id")
    private long roleId;
    /**
     * 角色中文名
     **/
    @Column(name = "role_name_cn")
    private String roleNameCn;
    /**
     * 角色英文名
     **/
    @Column(name = "role_name_en")
    private String roleNameEn;
    /**
     * 角色描述
     **/
    @Column(name = "role_desc")
    private String roleDesc;
    /**
     * 角色是否可用，0：停用 ，1:启用
     **/
    @Column(name = "enable")
    private boolean enable;
    /**
     * 父角色ID
     **/
    @Column(name = "parent_role_id")
    private long parentRoleId;
    /**
     * 创建时间
     **/
    @Column(name = "create_date")
    private Date createDate;
    /**
     * 创建人
     **/
    @Column(name = "create_user_id")
    private long createUserId;
    /**
     * 修改时间
     **/
    @Column(name = "modify_date")
    private Date modifyDate;
    /**
     * 修改人
     **/
    @Column(name = "modify_user_id")
    private long modifyUserId;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoleNameCn() {
        return roleNameCn;
    }

    public void setRoleNameCn(String roleNameCn) {
        this.roleNameCn = roleNameCn;
    }

    public String getRoleNameEn() {
        return roleNameEn;
    }

    public void setRoleNameEn(String roleNameEn) {
        this.roleNameEn = roleNameEn;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public long getParentRoleId() {
        return parentRoleId;
    }

    public void setParentRoleId(long parentRoleId) {
        this.parentRoleId = parentRoleId;
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
