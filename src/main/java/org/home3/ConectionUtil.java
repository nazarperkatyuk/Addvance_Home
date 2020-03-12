package org.home3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionUtil {

    private final static String JDBC_URL = "jdbc:mysql://localhost:3306/shop";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "1212";
    public static Connection getConnection(){

        try {
            return DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Can`t connect to BD");
        }
    }

}
