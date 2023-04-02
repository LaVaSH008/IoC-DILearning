package ru.lavash.springIIntroduction.iocdi.lesson6;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.iocdi.lesson1.Person;

public class DIVariables {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("iocdi/IoC&DIContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        System.out.println(person.getAge());
        System.out.println(person.getSurname());

        context.close();
    }
}
