package ru.kovorot.main.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.kovorot.main.hibernateTest.entity.Employee;

public class Test5 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try (
                SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class).buildSessionFactory()
        ) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee);

            session.createQuery("delete Employee where name = 'Ivan'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done!");
        }
    }
}
