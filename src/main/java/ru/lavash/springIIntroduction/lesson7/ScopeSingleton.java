package ru.lavash.springIIntroduction.lesson7;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.lesson1.Dog;

public class ScopeSingleton {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("singletonContext.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        System.out.println("Variable dependency on one object? " + (myDog == yourDog));

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        context.close();
    }
}
