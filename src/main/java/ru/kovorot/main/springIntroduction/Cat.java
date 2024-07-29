package ru.kovorot.main.springIntroduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat constructor");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
