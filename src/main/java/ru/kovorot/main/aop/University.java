package ru.kovorot.main.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private final List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Zeur", 4, 7.5);
        Student st2 = new Student("Kim", 3, 2.7);
        Student st3 = new Student("Mike", 2, 1.5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("Start work of getStudents method");
        System.out.println(students.get(3));
        System.out.println("Students information method getStudents");
        return students;
    }
}
