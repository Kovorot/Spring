package ru.kovorot.main.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Cat cat = context.getBean("cat", Cat.class);
//        cat.say();
        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
