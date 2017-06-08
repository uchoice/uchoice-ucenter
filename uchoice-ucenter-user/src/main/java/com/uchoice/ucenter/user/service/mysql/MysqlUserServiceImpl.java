package com.uchoice.ucenter.user.service.mysql;

import com.uchoice.ucenter.user.dao.mysql.entity.User;
import com.uchoice.ucenter.user.dao.mysql.mapper.UserMapper;
import com.uchoice.ucenter.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.ExampleMapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by levou on 2017/5/29.
 */
@Service
public class MysqlUserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public void modifyUser(User user) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",user.getUserId());
        userMapper.updateByExample(user,example);
    }

    @Override
    public User queryUserById(long userId) {
        User user = new User();
        user.setUserId(userId);
        return userMapper.selectOne(user);
    }

    @Override
    public List<User> queryUserByIds(long... userIds) {
        return null;
    }

    @Override
    public List<User> queryUserByIds(List<Long> userIds) {
        return null;
    }

    @Override
    public void deleteUserById(long userId) {
        Example example = new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",userId);
        userMapper.deleteByExample(example);
    }
}
