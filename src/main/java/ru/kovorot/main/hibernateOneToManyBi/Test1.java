package ru.kovorot.main.hibernateOneToManyBi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.kovorot.main.hibernateOneToManyBi.entity.Department;
import ru.kovorot.main.hibernateOneToManyBi.entity.Employee;

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
//            Department department = new Department("IT", 300, 1200);
//            Employee employee1 = new Employee("Zeur", "Garga", 800);
//            Employee employee2 = new Employee("Elena", "Smirnova", 1000);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        }


//        try (
//                SessionFactory factory = new Configuration()
//                        .configure("hibernate.cfg.xml")
//                        .addAnnotatedClass(Employee.class)
//                        .addAnnotatedClass(Department.class)
//                        .buildSessionFactory();
//                Session session = factory.getCurrentSession()
//        ) {
//            session.beginTransaction();
//            Department department = session.get(Department.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmployees());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        }


//        try (
//                SessionFactory factory = new Configuration()
//                        .configure("hibernate.cfg.xml")
//                        .addAnnotatedClass(Employee.class)
//                        .addAnnotatedClass(Department.class)
//                        .buildSessionFactory();
//                Session session = factory.getCurrentSession()
//        ) {
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        }






//        try (
//                SessionFactory factory = new Configuration()
//                        .configure("hibernate.cfg.xml")
//                        .addAnnotatedClass(Employee.class)
//                        .addAnnotatedClass(Department.class)
//                        .buildSessionFactory();
//                Session session = factory.getCurrentSession()
//        ) {
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        }



//        try (
//                SessionFactory factory = new Configuration()
//                        .configure("hibernate.cfg.xml")
//                        .addAnnotatedClass(Employee.class)
//                        .addAnnotatedClass(Department.class)
//                        .buildSessionFactory();
//                Session session = factory.getCurrentSession()
//        ) {
//            Department department = new Department("Sales", 800, 1500);
//            Employee employee1 = new Employee("Zeur", "Garga", 800);
//            Employee employee2 = new Employee("Elena", "Smirnova", 1500);
//            Employee employee3 = new Employee("Anton", "Sidorov", 1200);
//
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//            department.addEmployeeToDepartment(employee3);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
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
            System.out.println("Getting a department");
            Department department = session.get(Department.class, 4);

            System.out.println("Showing a department");
            System.out.println(department);
            System.out.println("Showing all employees of the department");
            System.out.println(department.getEmployees());

            session.getTransaction().commit();
            System.out.println("Done!");
        }
    }
}
