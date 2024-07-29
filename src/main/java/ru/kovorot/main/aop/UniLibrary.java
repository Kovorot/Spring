package ru.kovorot.main.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("We are getting a book from a uniLibrary");
        System.out.println("-------------------------------------------------------");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("We are returning the book to the uniLibrary");
        return "War of the worlds";
    }

    public void getMagazine() {
        System.out.println("We are getting a magazine from the uniLibrary");
        System.out.println("-------------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We are returning the magazine to the uniLibrary");
        System.out.println("-------------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We are adding the book to the uniLibrary");
        System.out.println("-------------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We are adding the magazine to the uniLibrary");
        System.out.println("-------------------------------------------------------");
    }
}
