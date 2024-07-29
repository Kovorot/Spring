package ru.kovorot.main.hibernateOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.kovorot.main.hibernateOneToOne.entity.Detail;
import ru.kovorot.main.hibernateOneToOne.entity.Employee;

public class Test2 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        try (
                SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
                Session session = factory.getCurrentSession()
        ) {

            session.beginTransaction();

            Detail d = session.get(Detail.class, 1);
            d.getEmployee().setEmpDetail(null);
            session.delete(d);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
