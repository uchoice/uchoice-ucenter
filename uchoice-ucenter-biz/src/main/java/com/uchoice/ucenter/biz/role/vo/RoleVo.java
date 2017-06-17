package com.uchoice.ucenter.biz.role.vo;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * Created by ${admin} on 2017/6/17.
 */
@Data
public class RoleVo {
    /**
     * 角色ID
     **/
    private long roleId;
    /**
     * 角色中文名
     **/
    private String roleNameCn;
    /**
     * 角色英文名
     **/
    private String roleNameEn;
    /**
     * 角色描述
     **/
    private String roleDesc;
    /**
     * 角色是否可用，0：停用 ，1:启用
     **/
    private boolean enable;
    /**
     * 父角色ID
     **/
    private long parentRoleId;
    /**
     * 创建时间
     **/
    private Date createDate;
    /**
     * 创建人
     **/
    private long createUserId;
    /**
     * 修改时间
     **/
    private Date modifyDate;
    /**
     * 修改人
     **/
    private long modifyUserId;
}
