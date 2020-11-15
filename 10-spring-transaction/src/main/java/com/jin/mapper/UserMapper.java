package com.jin.mapper;

import com.jin.pojo.User;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    List<User> findUsers();

    int addUser(User user);

    int deleteUser(@Param("id") int id);
}
