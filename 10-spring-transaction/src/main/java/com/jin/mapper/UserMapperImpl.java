package com.jin.mapper;

import com.jin.pojo.User;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

    private SqlSessionFactoryBean sqlSessionFactory;

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactoryBean sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public List<User> findUsers() {
        return getSqlSession().getMapper(UserMapper.class).findUsers();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
