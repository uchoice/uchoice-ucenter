package com.uchoice.ucenter.biz.role;

import com.uchoice.ucenter.biz.common.BizException;
import com.uchoice.ucenter.biz.common.RoleIdSequence;
import com.uchoice.ucenter.biz.role.vo.RoleVo;
import com.uchoice.ucenter.role.dao.msyql.entity.Role;
import com.uchoice.ucenter.role.dao.msyql.mapper.RoleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;

import javax.validation.constraints.NotNull;
import java.util.IllegalFormatCodePointException;
import java.util.List;

/**
 * Created by ${admin} on 2017/5/29.
 */
@Service
public class RoleBiz {
    private final Logger logger = LoggerFactory.getLogger(RoleBiz.class);
    @Autowired
    private RoleMapper roleMapper;
    public void addRootRole(@NotNull RoleVo roleVo) throws BizException{
        Role role = new Role();
        BeanUtils.copyProperties(roleVo,role);
        role.setRoleId(RoleIdSequence.roleIdSequence());
        role.setParentRoleId(-1);//根节点的角色
        roleMapper.insert(role);
    }

    public void addChildRole(@NotNull RoleVo roleVo) throws BizException{
        Role role = new Role();
        BeanUtils.copyProperties(roleVo,role);
        role.setRoleId(RoleIdSequence.roleIdSequence());
        roleMapper.insert(role);
    }

    public List<RoleVo> queryRolesByRoleIds(List<Long> roleIds) throws BizException{
        return null;
    }

    public List<RoleVo> queryRolesByRoleIds(Long ... RoleIds) throws BizException{
        return null;
    }
    public RoleVo queryRoleByRoleId(@NotNull Long roleId) throws BizException{
        Example example = new Example(Role.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("role_id",roleId.longValue());
        List<Role> roles = roleMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(roles)){
            throw new BizException("non-data for query");
        }
        if(roles.size() > 1){
            throw new BizException("mulit-data for query,please check.");
        }
        RoleVo roleVo = new RoleVo();
        BeanUtils.copyProperties(roles.get(0),roleVo);
        return roleVo;
    }

    public void modifyRoleVo(RoleVo roleVo) throws BizException{
        if(roleVo.getRoleId() <= 0){
            throw new BizException("Illegal role id value."+roleVo.getRoleId());
        }
        Example example = new Example(Role.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("role_id",roleVo.getRoleId());
        Role role = new Role();
        BeanUtils.copyProperties(roleVo,role);
        roleMapper.updateByExample(role,example);
    }

    public void deleteRoleByRoleId(Long ruleId) throws BizException{

    }
}
