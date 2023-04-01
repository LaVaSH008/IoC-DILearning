package ru.lavash.springIIntroduction.lesson4;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.lesson1.Person;

public class DIConstructorArgs {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("IoC&DIContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();

        context.close();
    }
}
