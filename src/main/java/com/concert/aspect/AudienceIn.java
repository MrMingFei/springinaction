package com.concert.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class AudienceIn {

    @Pointcut("execution(* com.concert.perform.Performance.perform(..))")
    public void performance(){}

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint jp){

        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP Around!!!");
        }catch (Throwable e){
            System.out.println("Demanding a refund");
        }
    }
}
