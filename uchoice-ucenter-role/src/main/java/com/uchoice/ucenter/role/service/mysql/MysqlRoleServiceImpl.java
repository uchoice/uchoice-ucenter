package com.uchoice.ucenter.role.service.mysql;

import com.uchoice.ucenter.role.dao.msyql.entity.Role;
import com.uchoice.ucenter.role.dao.msyql.mapper.RoleMapper;
import com.uchoice.ucenter.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by ${admin} on 2017/5/29.
 */
@Service
public class MysqlRoleServiceImpl implements RoleService{
    @Autowired
    RoleMapper roleMapper;
    @Override
    public void addRole(Role role) {
        roleMapper.insert(role);
    }

    @Override
    public void modifyRole(Role role) {
        Example example = new Example(Role.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("role_id",role.getRoleId());
        roleMapper.updateByExample(role,example);
    }

    @Override
    public void deleteRole(long roleId) {
        Example example = new Example(Role.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("role_id",roleId);
        roleMapper.deleteByExample(example);
    }

    @Override
    public Role queryRoleByRoleId(long roleId) {
        return null;
    }

    @Override
    public List<Role> queryRolesByRoleIds(long... roleIds) {
        return null;
    }

    @Override
    public List<Role> queryRolesByRolIds(List<Long> roleIds) {
        return null;
    }

    @Override
    public List<Role> queryRolesByRootRoleId(long rootRoleId) {
        return null;
    }
}
