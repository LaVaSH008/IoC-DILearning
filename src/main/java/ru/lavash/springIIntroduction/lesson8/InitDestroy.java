package ru.lavash.springIIntroduction.lesson8;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.lesson1.Dog;

public class InitDestroy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("init&Destroy.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        context.close();
    }
}
