package ru.lavash.springIIntroduction.lesson13;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.lesson1.Dog;
import ru.lavash.springIIntroduction.lesson1.Person;

public class ScopeAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsConfiguration.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println("Variable is equals? " + (myDog == yourDog));

        System.out.println(myDog);
        System.out.println(yourDog);

        context.close();
    }
}
