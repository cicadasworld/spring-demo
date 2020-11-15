package com.jin;

import com.jin.pojo.Student;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentTest.class);

    @Test
    void testStudent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = context.getBean("student", Student.class);
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info(student.toString());
        }
    }
}
