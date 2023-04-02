package ru.lavash.springIIntroduction.iocdi.lesson12;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.iocdi.lesson1.Person;

public class ValueAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("iocdi/AnnotationsConfiguration.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}
