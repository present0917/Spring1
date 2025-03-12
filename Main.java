package org.example;


import org.example.Test.TestDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");
        String[] beans = context.getBeanDefinitionNames();
        for(String str : beans){
            System.out.println(str);
        }
        TestService testService = context.getBean("TestServiceConstructor",TestService.class);
        testService.selectAllThings().forEach((o)-> System.out.println(o));

        }
    }
