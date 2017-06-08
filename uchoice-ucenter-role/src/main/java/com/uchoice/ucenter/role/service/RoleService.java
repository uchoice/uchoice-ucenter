package com.uchoice.ucenter.role.service;

import com.uchoice.ucenter.role.dao.msyql.entity.Role;

import java.util.List;

/**
 * 角色管理Service
 * Created by ${admin} on 2017/5/29.
 */
public interface RoleService {
    void addRole(Role role);
    void modifyRole(Role role);
    void deleteRole(long roleId);
    Role queryRoleByRoleId(long roleId);
    List<Role> queryRolesByRoleIds(long ... roleIds);
    List<Role> queryRolesByRolIds(List<Long> roleIds);
    List<Role> queryRolesByRootRoleId(long rootRoleId);


}
