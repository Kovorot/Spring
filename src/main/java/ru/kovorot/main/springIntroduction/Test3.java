package ru.kovorot.main.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

    public static void main(String[] args) {
//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYourPet();

        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println("person.getSurname() = " + person.getSurname());
        System.out.println("person.getAge() = " + person.getAge());
        context.close();
    }
}
