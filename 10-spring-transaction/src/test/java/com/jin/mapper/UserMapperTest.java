package com.jin.mapper;

import com.jin.pojo.User;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperTest {

    @Test
    void testFindUsers() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = mapper.findUsers();
        users.forEach(System.out::println);
    }

    @Test
    void testTransaction() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        mapper.addUser(new User(5, "田七", "2536789"));
        mapper.deleteUser(5);
        mapper.findUsers().forEach(System.out::println);
    }
}
