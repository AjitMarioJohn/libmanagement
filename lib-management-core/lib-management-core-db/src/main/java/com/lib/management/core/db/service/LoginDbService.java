package com.lib.management.core.db.service;

import com.lib.management.common.exception.ConnectionFailedException;

import java.sql.SQLException;

public interface LoginDbService {
    boolean validateUserFromDb(String username, String password) throws SQLException, ConnectionFailedException;
}
