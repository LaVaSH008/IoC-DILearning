package ru.lavash.springIIntroduction.iocdi.lesson14;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.lavash.springIIntroduction.iocdi.lesson1.Pet;

public class ConfigurationOnJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        //Person person = context.getBean("personBean", Person.class);
        //person.callYourPet();

        Pet cat = context.getBean("catBean", Pet.class);
        cat.say();

        context.close();
    }
}
