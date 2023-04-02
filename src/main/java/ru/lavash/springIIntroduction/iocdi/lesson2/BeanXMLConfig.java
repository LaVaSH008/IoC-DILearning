package ru.lavash.springIIntroduction.iocdi.lesson2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.iocdi.lesson1.Pet;

public class BeanXMLConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("iocdi/IoC&DIContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}
