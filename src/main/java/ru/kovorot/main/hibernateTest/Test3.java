package ru.kovorot.main.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.kovorot.main.hibernateTest.entity.Employee;

import java.util.List;

public class Test3 {

    @SuppressWarnings({"unchecked", "deprecation"})
    public static void main(String[] args) {
        try (
                SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class).buildSessionFactory()
        ) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            List<Employee> employees = session.createQuery("from Employee").getResultList();

            List<Employee> employees = session.createQuery("from Employee where salary > 700").getResultList();

            for (Employee e : employees) {
                System.out.println(e);
            }

            session.getTransaction().commit();

            System.out.println("Done!");
        }
    }
}
