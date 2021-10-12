package com.lib.management.domain.service;

import com.lib.management.common.exception.ConnectionFailedException;

import java.sql.SQLException;

public interface LoginDomainService {
    boolean validateUser(String username, String password) throws SQLException, ConnectionFailedException;
}
