package com.jin.staticproxy;

import com.jin.service.AddService;
import com.jin.service.AddServiceImpl;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticProxyTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StaticProxyTest.class);

    @Test
    void testStaticProxy() {
        AddService addService = new AddServiceImpl();
        AddServiceProxy proxy = new AddServiceProxy(addService);
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("before add method call");
        }
        int result = proxy.add(1, 2);
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("after add method call");
        }
        assertEquals(3, result);
    }
}
