package ru.lavash.springIIntroduction.aop.lesson1;

import org.springframework.stereotype.Component;
import ru.lavash.springIIntroduction.aop.lesson2.AbstractLibrary;

@Component
public class UniLibrary extends AbstractLibrary {
    @Override
    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из UniLibrary");
    }

    public String returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "OK";
    }
}
