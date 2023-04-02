package ru.lavash.springIIntroduction.iocdi.lesson3;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.iocdi.lesson1.Person;
import ru.lavash.springIIntroduction.iocdi.lesson1.Pet;

public class DIExample {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("iocdi/IoC&DIContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);

        Person person = new Person(pet);
        person.callYourPet();

        context.close();
    }
}
