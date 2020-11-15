package com.jin;

import com.jin.service.AddService;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddServiceTest {

    @Test
    void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AddService addService = context.getBean("addService", AddService.class);
        int result = addService.add(1, 2);
        assertEquals(3, result);
    }
}
