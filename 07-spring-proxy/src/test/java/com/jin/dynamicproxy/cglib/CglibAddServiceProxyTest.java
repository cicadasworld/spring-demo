package com.jin.dynamicproxy.cglib;

import com.jin.service.AddService;
import com.jin.service.AddServiceImpl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CglibAddServiceProxyTest {

    @Test
    void testCglibDynamicProxy() {
        AddService addService = new AddServiceImpl();
        AddServiceInterceptor interceptor = new AddServiceInterceptor(addService);
        AddService proxy = (AddService) interceptor.getProxy();
        int result = proxy.add(1, 2);
        assertEquals(3, result);
    }
}
