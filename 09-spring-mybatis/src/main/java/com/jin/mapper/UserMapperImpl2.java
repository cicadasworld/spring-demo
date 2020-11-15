package com.jin.mapper;

import com.jin.pojo.User;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> findUsers() {
        return getSqlSession().getMapper(UserMapper.class).findUsers();
    }
}
