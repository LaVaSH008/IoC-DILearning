package ru.lavash.springIIntroduction.iocdi.lesson1;

//@Component("catBean")
public class Cat implements Pet{
    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
