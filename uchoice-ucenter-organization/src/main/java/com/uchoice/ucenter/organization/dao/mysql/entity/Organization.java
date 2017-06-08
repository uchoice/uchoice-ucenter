package com.uchoice.ucenter.organization.dao.mysql.entity;

import com.uchoice.ucenter.config.annotation.DescCls;
import com.uchoice.ucenter.config.db.mysql.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

/**
 * 组织机构实体
 * Created by ${admin} on 2017/5/29.
 */
@Table(name = "uc_origanization")
public class Organization extends BaseEntity{
    /**组织机构ID**/
    @Column(name = "org_id")
    private long orgId;
    /**组织机构中文名**/
    @Column(name = "org_name_cn")
    private String orgNameCn;
    /**组织机构英文名**/
    @Column(name = "org_name_en")
    private String orgNameEn;
    /**组织机构类型ID**/
    @Column(name = "org_type_id")
    private long orgTypeId;
    /**组织机构描述**/
    @Column(name = "org_desc")
    private String orgDesc;
    /**组织机构是否可用**/
    @Column(name = "enable")
    private boolean enable;
    /**组织机构负责人id**/
    @Column(name = "org_leader_user_id")
    private long orgLeaderUserId;
    /**组织机构联系人ID**/
    @Column(name = "org_contact_user_id")
    private long orgContactUserId;
    /**组织机构父组织ID**/
    @Column(name = "parent_org_id")
    private long parentOrgId;
    /**创建时间**/
    @Column(name = "create_date")
    private Date createDate;
    /**创建用户ID**/
    @Column(name = "create_user_id")
    private long createUserId;
    /**修改时间**/
    @Column(name = "modify_date")
    private Date modifyDate;
    /**修改用户ID**/
    @Column(name = "modify_user_id")
    private long modifyUserId;

    public long getOrgId() {
        return orgId;
    }

    public void setOrgId(long orgId) {
        this.orgId = orgId;
    }

    public String getOrgNameCn() {
        return orgNameCn;
    }

    public void setOrgNameCn(String orgNameCn) {
        this.orgNameCn = orgNameCn;
    }

    public String getOrgNameEn() {
        return orgNameEn;
    }

    public void setOrgNameEn(String orgNameEn) {
        this.orgNameEn = orgNameEn;
    }

    public long getOrgTypeId() {
        return orgTypeId;
    }

    public void setOrgTypeId(long orgTypeId) {
        this.orgTypeId = orgTypeId;
    }

    public long getOrgLeaderUserId() {
        return orgLeaderUserId;
    }

    public void setOrgLeaderUserId(long orgLeaderUserId) {
        this.orgLeaderUserId = orgLeaderUserId;
    }

    public long getOrgContactUserId() {
        return orgContactUserId;
    }

    public void setOrgContactUserId(long orgContactUserId) {
        this.orgContactUserId = orgContactUserId;
    }

    public String getOrgDesc() {
        return orgDesc;
    }

    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public long getParentOrgId() {
        return parentOrgId;
    }

    public void setParentOrgId(long parentOrgId) {
        this.parentOrgId = parentOrgId;
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
