package ru.kovorot.main.springIntroduction;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements Pet {
//    private String name;

    public Dog() {
        System.out.println("Dog constructor");
    }

    @Override
    public void say() {
        System.out.println("Bow-Bow");
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Dog init");
//    }
//
//    @PreDestroy
//    public void destroy() {
//        System.out.println("Dog destroy");
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
