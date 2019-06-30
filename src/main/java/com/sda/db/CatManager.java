package com.sda.db;


import com.mysql.cj.protocol.ResultsetRow;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CatManager {

    public void createCat(Session session, Cat cat){
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.save(cat);
        transaction.commit();
        session.close();
    }


//    private static final String INSERT_INTO_CATS_NAME_BIRTH_YEAR_COLOUR_VALUES = "INSERT INTO cats(name, birth_year, colour) VALUES (?, ?, ? )";
//
//    public CatManager() {
//    }
//
//    public void createCat(Connection connection) throws SQLException {
//
//
//    }

//  WPISUJEMY CAŁE ZAPYTANIE POPRZEZ STATEMENT
//        Statement statement = connection.createStatement();
//        statement.executeUpdate("INSERT INTO cats(name, birth_year, colour) VALUES ('Rys', 2000, 'Brown' )");
//        statement.executeUpdate("INSERT INTO cats(name, birth_year, colour) VALUES ('Kotlin', 2015, 'Black' )");

//       WPISUJEMY ZAPYTANIE WPISUJAC SAME PARAMETRY POPRZEZ PREPAREDSTATEMENT
//        PreparedStatement statement = connection.prepareStatement(INSERT_INTO_CATS_NAME_BIRTH_YEAR_COLOUR_VALUES);
//        statement.setString(1,"Rys");
//        statement.setInt(2,2000);
//        statement.setString(3,"Brown");
//        statement.executeUpdate();
//
//        statement.setString(1,"Bartula");
//        statement.setInt(2,1993);
//        statement.setString(3,"White");
//        statement.executeUpdate();
//
//    }
//    List<Cat> fintAllCats(Connection connection) throws SQLException{
//        Statement statement = connection.createStatement();
//        List<Cat> cats = new ArrayList<>();
//        ResultSet result = statement.executeQuery("SELECT c.id as cat_id,c.name as cat_name,c.birth_year as cat_by, c.colour as cat_colour FROM cats c");
//        while (result.next()){
//            int catID = result.getInt("cat_id");
//            String catName = result.getString("cat_name");
//            int birthYear = result.getInt("cat_by");
//            String colour = result.getString("cat_colour");
//            cats.add(new Cat(catID,catName,birthYear,colour));
//        }
//        return cats;
//    }
}
