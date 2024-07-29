package ru.kovorot.main.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.kovorot.main.hibernateTest.entity.Employee;

public class Test1 {

    public static void main(String[] args) {

        try (
                SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory()
        ) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Ivan", "Ivanov", "IT", 700);

            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
            System.out.println(employee);
        }
    }
}
