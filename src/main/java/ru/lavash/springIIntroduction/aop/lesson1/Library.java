package ru.lavash.springIIntroduction.aop.lesson1;

import org.springframework.stereotype.Component;

@Component(value = "libraryBean")
public class Library {
    public void getBook(){
        System.out.println("Мы берем книгу");
    }
}
