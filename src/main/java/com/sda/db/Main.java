package com.sda.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cats?createDatabaseIfNotExist=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "Nokia3310");

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Cat c = new Cat("Rys", 2000, "Brown");
        Cat c2 = new Cat("Kotlin", 1999, "Black");
        Cat c3 = new Cat("OlaCiacho", 1998, "PINK");

        CatManager catManager = new CatManager();
        catManager.createCat(sessionFactory.openSession(),c);
        catManager.createCat(sessionFactory.openSession(),c2);
        catManager.createCat(sessionFactory.openSession(),c3);

        sessionFactory.close();

//        DbManager dbManager = new DbManager();
//        dbManager.createDb(connection);
//        dbManager.clearTable(connection);
//        CatManager catManager = new CatManager();
//        catManager.createCat(connection);
//        List<Cat> cats = catManager.fintAllCats(connection);
//        for (Cat cat: cats){
//            System.out.println(cat);
//        }
    }
}
