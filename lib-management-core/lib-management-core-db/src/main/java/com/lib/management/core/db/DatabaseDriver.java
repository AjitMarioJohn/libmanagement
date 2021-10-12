package com.lib.management.core.db;

import com.lib.management.common.exception.ConnectionFailedException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;

public enum DatabaseDriver {
    DB("com.mysql.cj.jdbc.Driver","jdbc:mysql://ec2-18-223-117-135.us-east-2.compute.amazonaws.com:3306/lib_management",
            "root", "Mysql@123");
    private Connection connection;
    DatabaseDriver(String driverUrl, String dbUrl, String username, String password) {
        try {
            Class.forName(driverUrl);
            connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws ConnectionFailedException {
        return Optional.of(connection).orElseThrow(ConnectionFailedException :: new);
    }
}
