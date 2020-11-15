package com.jin;

import com.jin.pojo.Vehicle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleTest {

    @Test
    void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Vehicle vehicle = context.getBean("vehicle", Vehicle.class);
        vehicle.getCar().run();
        vehicle.getPlane().fly();
    }
}
