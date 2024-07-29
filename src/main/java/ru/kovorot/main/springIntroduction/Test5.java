package ru.kovorot.main.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog d = context.getBean("myPet", Dog.class);
        d.say();
        context.close();
    }
}
