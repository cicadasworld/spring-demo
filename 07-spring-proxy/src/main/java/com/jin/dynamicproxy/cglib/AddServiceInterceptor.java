package com.jin.dynamicproxy.cglib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class AddServiceInterceptor implements MethodInterceptor {

    private static final Logger LOGGER = LoggerFactory.getLogger(AddServiceInterceptor.class);

    private Object target;

    public AddServiceInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        String methodName = method.getName();
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("before {} method call", methodName);
            LOGGER.info("methodProxy: {}", methodProxy);
        }
        Object invoke = method.invoke(target, args);
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("after {} method call", methodName);
        }
        return invoke;
    }

    public Object getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
}
