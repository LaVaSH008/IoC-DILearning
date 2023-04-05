package ru.lavash.springIIntroduction.aop.lesson1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.lavash.springIIntroduction.aop.lesson2.SchoolLibrary;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        //uniLibrary.getBook();
        //uniLibrary.getMagazine();
        uniLibrary.returnBook();

        //SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        //schoolLibrary.getBook();

        context.close();
    }
}
