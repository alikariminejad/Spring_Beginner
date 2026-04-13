package com.in28minutes.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.annotation.*;
import org.aspectj.lang.JoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Before("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.allPackageConfigUsingBean()")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint){
        logger.info("Before Aspect - {} is called with these arguments: {}", joinPoint, joinPoint.getArgs());
    }

    @After("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
    public void logMethodCallAfterExecution(JoinPoint joinPoint){
        logger.info("After Aspect - {} is called with these arguments: {}", joinPoint, joinPoint.getArgs());
    }

    @AfterThrowing(value = "com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessPackageConfig()",throwing = "exception")
    public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception){
        logger.info("After Exception Aspect - {} is called with these arguments: {} and this exception: {}", joinPoint,
                                                                                                        joinPoint.getArgs(),
                                                                                                        exception);
    }

    @AfterReturning(value = "com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.dataPackageConfig()",returning = "resultValue")
    public void logMethodCallAfterSuccessfulExcecution(JoinPoint joinPoint, Object resultValue){
        logger.info("After Excecution Aspect - {} is called with these arguments: {} and returned: {}", joinPoint,
                joinPoint.getArgs(),
                resultValue);
    }
}
