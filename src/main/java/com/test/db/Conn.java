package com.test.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {

    private static String url = "jdbc:mysql://localhost:3306/db_mybatis";

    private static String username = "root";

    private static String password = "123456";

    private static String className = "com.mysql.jdbc.Driver";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(className);

            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

}
