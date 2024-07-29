package ru.kovorot.main.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {
    @Value("Who am I?")
    private String name;
    @Value("Vladimir")
    private String author;
    @Value("2011")
    private int publicationYear;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}
