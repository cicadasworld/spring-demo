package com.jin.dynamicproxy.jdk;

import com.jin.service.AddService;
import com.jin.service.AddServiceImpl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JdkAddServiceProxyTest {

    @Test
    void testJdkDynamicProxy() {
        AddService addService = new AddServiceImpl();
        AddServiceHandler h = new AddServiceHandler(addService);
        AddService proxy = h.getProxy();
        int result = proxy.add(1, 2);
        assertEquals(3, result);
    }
}
