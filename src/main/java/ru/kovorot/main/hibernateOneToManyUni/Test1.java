package ru.kovorot.main.hibernateOneToManyUni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.kovorot.main.hibernateOneToManyUni.entity.Department;
import ru.kovorot.main.hibernateOneToManyUni.entity.Employee;

public class Test1 {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
//        try (
//                SessionFactory factory = new Configuration()
//                        .configure("hibernate.cfg.xml")
//                        .addAnnotatedClass(Employee.class)
//                        .addAnnotatedClass(Department.class)
//                        .buildSessionFactory();
//                Session session = factory.getCurrentSession()
//        ) {
//            Department department = new Department("HR", 500, 1500);
//            Employee employee1 = new Employee("Oleg", "Ivanov", 800);
//            Employee employee2 = new Employee("Andrey", "Sidorov", 1200);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//            session.save(department);
//
//            System.out.println("Done!");
//        }


        try (
                SessionFactory factory = new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Department.class)
                        .buildSessionFactory();
                Session session = factory.getCurrentSession()
        ) {
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 6);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
