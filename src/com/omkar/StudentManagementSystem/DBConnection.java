package com.omkar.StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "root123"
            );

            // System.out.println("Database Connected Successfully");
            return con;

        } catch (SQLException e) {
            System.out.println("Database Connection Failed");
            e.printStackTrace();
            return null;
        }
    }
}