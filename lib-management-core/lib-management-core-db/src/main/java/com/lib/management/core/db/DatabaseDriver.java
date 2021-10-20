package com.lib.management.core.db;

import com.lib.management.common.enums.AppPropertyEnum;
import com.lib.management.common.exception.ConnectionFailedException;
import com.lib.management.common.utils.PropertiesHolderUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Properties;

public class DatabaseDriver {
    private Connection connection;
    private DatabaseDriver() {
        try {
            Properties properties = PropertiesHolderUtils.loadPropertiesFile("dbConfig.properties");
            Class.forName(properties.getProperty(AppPropertyEnum.DB_DRIVER_CLASS.getFileString()));
            connection = DriverManager.getConnection(properties.getProperty(AppPropertyEnum.DB_URL.getFileString()), properties.getProperty(AppPropertyEnum.DB_USER.getFileString()), properties.getProperty(AppPropertyEnum.DB_PASSWORD.getFileString()));
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static class DatabaseDriverInitiator {
        private static final DatabaseDriver INSTANCE = new DatabaseDriver();
    }

    public static DatabaseDriver getInstance(){
        return DatabaseDriverInitiator.INSTANCE;
    }
    public Connection getConnection() throws ConnectionFailedException {
        return Optional.ofNullable(connection).orElseThrow(ConnectionFailedException :: new);
    }
}
