package ru.kovorot.main.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.kovorot.main.hibernateTest.entity.Employee;

public class Test2 {

    public static void main(String[] args) {

        try (
                SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class).buildSessionFactory()
        ) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Oleg", "Sidorov", "HR", 750);

            session.beginTransaction();
            session.save(employee);
//            session.getTransaction().commit();

            int myId = employee.getId();
//            session = factory.getCurrentSession();

//            session.beginTransaction();
            Employee emp = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(emp);

            System.out.println("Done!");
        }
    }
}
