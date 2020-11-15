package com.jin.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

    @Before("execution(* com.jin.service.AddServiceImpl.*(..))")
    public void before() {
        System.out.println("=======LogAspect's before=========");
    }

}
