package com.jin;

import com.jin.config.AppConfig;
import com.jin.pojo.User;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserTest.class);

    @Test
    void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = context.getBean(User.class);
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(user.getName());
        }
    }
}
