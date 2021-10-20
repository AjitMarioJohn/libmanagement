package com.lib.management.core.db.service.impl;

import com.lib.management.common.exception.ConnectionFailedException;
import com.lib.management.core.db.DatabaseDriver;
import com.lib.management.core.db.queries.DBQueries;
import com.lib.management.core.db.service.LoginDbService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDbServiceImpl implements LoginDbService {
    @Override
    public boolean validateUserFromDb(String username, String password) throws SQLException, ConnectionFailedException {
        boolean validated = false;
        int index = 1;
        Connection connection = DatabaseDriver.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DBQueries.getInstance().VALIDATE_USER);
        preparedStatement.setString(index++, username);
        preparedStatement.setString(index, password);
        System.out.println(preparedStatement);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            validated = true;
        }
        return validated;
    }
}

