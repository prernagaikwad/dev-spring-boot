package com.prernagaikwad.springboot.AOPdemo.Aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Pointcut("execution(* com.prernagaikwad.springboot.AOPdemo.DAO.*.*(..))")
    private void forDaoPackage() {}

    //  create a pointcut for getter methods
    @Pointcut("execution(* com.prernagaikwad.springboot.AOPdemo.DAO.*.get*(..))")
    private void getter(){}

    // create a pointcut for setter methods
    @Pointcut("execution(* com.prernagaikwad.springboot.AOPdemo.DAO.*.set*(..))")
    private void setter(){}
    // create pointcut : include package ... exclude getter and setter

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    private void forDaoPackageNoGetterSetter(){}

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=====>>> Executing @Before advice on method");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("\n=====>>> Performing API analytics");
    }
}