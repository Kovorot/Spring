package ru.kovorot.main.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ru.kovorot.main.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice() {
//        System.out.println("beforeGetStudentsLoggingAdvice: logging getting students list before working method");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
//        Student s1 = students.get(0);
//
//        String nameSurname = s1.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        s1.setNameSurname(nameSurname);
//
//        double avgGrade = s1.getAvgGrade();
//        s1.setAvgGrade(++avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice: logging getting students list after working method");
//    }
//
//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(JoinPoint joinPoint, Throwable exception) {
//        System.out.println("Its my life " + exception);
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: logging exception fuck you");
//    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: logging getting students from after aspect");
    }
}
