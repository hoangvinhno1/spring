package com.example.springboot.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String connectionURL = "jdbc:mysql://" + "localhost" + ":3306/" + "study";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionURL, "root",
                    "hoangvinh93");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(conn);
    }
}
