package ru.lavash.springIIntroduction.lesson9;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.lavash.springIIntroduction.lesson1.Cat;

public class ComponentAnnotation {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("AnnotationsConfiguration.xml");

        Cat myCat = context.getBean("cat", Cat.class);
        myCat.say();

        Cat yourCat = context.getBean("cat", Cat.class);
        yourCat.say();

        context.close();
    }
}
