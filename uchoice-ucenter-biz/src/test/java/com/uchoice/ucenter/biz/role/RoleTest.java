package com.uchoice.ucenter.biz.role;

import com.uchoice.ucenter.biz.UchoiceUcenterBizApplication;
import com.uchoice.ucenter.biz.common.BizException;
import com.uchoice.ucenter.biz.role.vo.RoleVo;
import com.uchoice.ucenter.config.db.mysql.BaseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by ${admin} on 2017/6/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UchoiceUcenterBizApplication.class)
public class RoleTest {
    @Autowired
    RoleBiz roleBiz;
    @Test
    public void testAddRole(){
        RoleVo roleVo = new RoleVo();
        roleVo.setParentRoleId(-1);
        roleVo.setModifyUserId(Long.valueOf(15121515));
        roleVo.setModifyDate(new Date());
        roleVo.setCreateUserId(Long.valueOf(15121515));
        roleVo.setCreateDate(new Date());
        roleVo.setEnable(true);
        roleVo.setRoleDesc("this is root role");
        roleVo.setRoleNameCn("根角色");
        roleVo.setRoleNameEn("root role");
        try {
            roleBiz.addRootRole(roleVo);
        }catch (BizException e){
            e.printStackTrace();
        }
    }
    @Test
    public void testModifyRole(){

    }
    @Test
    public void testQueryRole(){

    }

}
