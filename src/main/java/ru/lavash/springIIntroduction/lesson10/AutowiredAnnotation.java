package ru.lavash.springIIntroduction.lesson10;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.lesson1.Person;

public class AutowiredAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsConfiguration.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        context.close();
    }
}
