package com.mainproject.wrieating.dbsource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://wrieating-database.ca59q4wbjg2d.ap-northeast-2.rds.amazonaws.com:13306/wrieatingdb";
    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "wrieating123";
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/wrieatingdb";
//    private static final String DB_USER = "";
//    private static final String DB_PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
