package ru.kovorot.main.springIntroduction;

public class Test1 {

    public static void main(String[] args) {
        Pet pet = new Dog();
        pet.say();
        pet = new Cat();
        pet.say();
    }
}
