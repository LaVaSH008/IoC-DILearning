package ru.lavash.springIIntroduction.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    //This advice for classes with method getBook()
    //@Before("execution(public void getBook())")
    //This advice for class UniLibrary with method getBook()
    //@Before("execution(public void ru.lavash.springIIntroduction.aop.lesson1.UniLibrary.getBook())")
    //This advice for class with method who start on get...()
    @Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу");
    }

    //This advice for all return type
    //@Before("execution(public * returnBook())")
    //This advice for all access modifier
    @Before("execution(* returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
    }
}