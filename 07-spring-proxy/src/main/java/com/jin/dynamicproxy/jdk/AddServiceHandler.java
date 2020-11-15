package com.jin.dynamicproxy.jdk;

import com.jin.service.AddService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AddServiceHandler implements InvocationHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddServiceHandler.class);

    private AddService addService;

    public AddServiceHandler(AddService addService) {
        this.addService = addService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName();
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("before {} method call", methodName);
        }
        Object invoke = method.invoke(addService, args);
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("after {} method call", methodName);
        }
        return invoke;
    }

    public AddService getProxy() {
        return (AddService) Proxy.newProxyInstance(addService.getClass().getClassLoader(),
                addService.getClass().getInterfaces(), this);
    }
}
