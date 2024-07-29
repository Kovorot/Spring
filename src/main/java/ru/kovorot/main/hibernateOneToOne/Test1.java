package ru.kovorot.main.hibernateOneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.kovorot.main.hibernateOneToOne.entity.Employee;
import ru.kovorot.main.hibernateOneToOne.entity.Detail;

public class Test1 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

//        try (
//                SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory()
//        ) {
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Zeur", "Migelev", "IT", 500);
//            Detail detail = new Detail("Baku", "123456789", "ZeurTop@main.ru");
//
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        }


        try (
                SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory()
        ) {
            Session session = factory.getCurrentSession();

            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
            Detail detail = new Detail("Moscow", "987654321", "Oleg@main.ru");

            employee.setEmpDetail(detail);

            session.beginTransaction();

            session.save(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        }


//        try (
//                SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
//                        .addAnnotatedClass(Employee.class).addAnnotatedClass(Detail.class).buildSessionFactory();
//                Session session = factory.getCurrentSession()
//        ) {
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            session.delete(employee.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        }
    }
}
