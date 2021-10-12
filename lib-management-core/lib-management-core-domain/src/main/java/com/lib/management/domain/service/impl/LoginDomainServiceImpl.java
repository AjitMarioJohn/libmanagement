package com.lib.management.domain.service.impl;

import com.lib.management.common.exception.ConnectionFailedException;
import com.lib.management.core.db.factory.DbServiceFactory;
import com.lib.management.core.db.service.LoginDbService;
import com.lib.management.domain.service.LoginDomainService;

import java.sql.SQLException;

public class LoginDomainServiceImpl implements LoginDomainService {
    @Override
    public boolean validateUser(String username, String password) throws SQLException, ConnectionFailedException {
        LoginDbService loginDbService = DbServiceFactory.getInstance().getLoginService();
        return loginDbService.validateUserFromDb(username,password);
    }
}
