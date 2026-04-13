package com.in28minutes.learn_spring_aop.aopexample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PerformanceTrackingAspect {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Around("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.businessAndDataPackageConfig()")
    @Around("com.in28minutes.learn_spring_aop.aopexample.aspects.CommonPointcutConfig.trackTimeAnnotation()")
    public Object executionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long startExecutionTime = System.currentTimeMillis();

        Object proceed = proceedingJoinPoint.proceed();

        long endExecutionTime = System.currentTimeMillis();
        long executionTime = endExecutionTime - startExecutionTime;

        logger.info("This method: {} has executed in {} ms", proceedingJoinPoint, executionTime);
        return proceed;
    }
}
