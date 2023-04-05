package ru.lavash.springIIntroduction.aop.lesson1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("ru.lavash.springIIntroduction.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
