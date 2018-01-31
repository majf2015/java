package com.sdcm;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;



/**
 * Created by Administrator on 2018/1/30.
 */
@Aspect
public class AopImp implements Aop{
    @Pointcut("execution(** com.sdcm.SpEL.show(..))")
    public void aopShow(){
        System.out.println("aopShow");
    }

    @Before("aopShow()")
    public void beforeShow() {
        System.out.println("beforeShow:AopImp.show");
    }

    @AfterThrowing("aopShow()")
    public void afterThrowingShow() {
        System.out.println("afterThrowingShow:AopImp.show");
    }

    @AfterReturning("aopShow()")
    public void afterReturningShow() {
        System.out.println("afterReturningShow:AopImp.show");
    }
}
