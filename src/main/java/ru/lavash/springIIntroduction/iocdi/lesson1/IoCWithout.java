package ru.lavash.springIIntroduction.iocdi.lesson1;

public class IoCWithout {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.say();
    }
}
