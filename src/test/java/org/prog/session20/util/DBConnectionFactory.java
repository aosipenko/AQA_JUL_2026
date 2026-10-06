package org.prog.session20.util;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionFactory {

    @SneakyThrows
    public static Connection getConnection() {
        String envType = System.getProperty("envType", "jenkins");
        if ("jenkins".equals(envType)) {
            return DriverManager.getConnection(
                    "jdbc:mysql://mysql-db-1:3306/db",
                    "root",
                    "password");
        } else {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db",
                    "root",
                    "password");
        }
    }
}
