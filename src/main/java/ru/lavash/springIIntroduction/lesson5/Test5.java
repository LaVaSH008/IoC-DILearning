package ru.lavash.springIIntroduction.lesson5;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.lesson1.Person;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        
        context.close();
    }
    
}
