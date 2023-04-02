package ru.lavash.springIIntroduction.iocdi.lesson14;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.lavash.springIIntroduction.iocdi.lesson1.Cat;
import ru.lavash.springIIntroduction.iocdi.lesson1.Pet;

@Configuration
//@ComponentScan("ru.lavash.springIIntroduction")
public class MyConfig {
    @Bean
    @Scope("singleton")
    public Pet catBean(){
        return new Cat();
    }

}
