package ru.kovorot.main.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Zeur", book);
        uniLibrary.getMagazine();
        uniLibrary.addMagazine();

        context.close();
    }
}
