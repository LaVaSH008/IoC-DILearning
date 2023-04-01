package ru.lavash.springIIntroduction.lesson1;

public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow-meow");
    }
}
