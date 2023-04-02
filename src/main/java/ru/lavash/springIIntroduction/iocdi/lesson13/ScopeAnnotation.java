package ru.lavash.springIIntroduction.iocdi.lesson13;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.iocdi.lesson1.Dog;

public class ScopeAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("iocdi/AnnotationsConfiguration.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println("Variable is equals? " + (myDog == yourDog));

        System.out.println(myDog);
        System.out.println(yourDog);

        context.close();
    }
}
