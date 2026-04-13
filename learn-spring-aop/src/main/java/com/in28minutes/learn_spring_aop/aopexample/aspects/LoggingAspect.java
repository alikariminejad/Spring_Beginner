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

    @Before("execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint){
        logger.info("Before Aspect - {} is called with these arguments: {}", joinPoint, joinPoint.getArgs());
    }

    @After("execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))")
    public void logMethodCallAfterExecution(JoinPoint joinPoint){
        logger.info("After Aspect - {} is called with these arguments: {}", joinPoint, joinPoint.getArgs());
    }

    @AfterThrowing(value = "execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))",throwing = "exception")
    public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception){
        logger.info("After Exception Aspect - {} is called with these arguments: {} and this exception: {}", joinPoint,
                                                                                                        joinPoint.getArgs(),
                                                                                                        exception);
    }

    @AfterReturning(value = "execution(* com.in28minutes.learn_spring_aop.aopexample.*.*.*(..))",returning = "resultValue")
    public void logMethodCallAfterSuccessfulExcecution(JoinPoint joinPoint, Object resultValue){
        logger.info("After Exception Aspect - {} is called with these arguments: {} and returned: {}", joinPoint,
                joinPoint.getArgs(),
                resultValue);
    }
}
