package com.lib.management.core.db.factory;

import com.lib.management.core.db.service.LoginDbService;
import com.lib.management.core.db.service.impl.LoginDbServiceImpl;

public class DbServiceFactory {
    private DbServiceFactory(){}
    private static class ServiceFactoryInitiator {
        private final static DbServiceFactory INSTANCE = new DbServiceFactory();
    }
    public static DbServiceFactory getInstance(){
        return ServiceFactoryInitiator.INSTANCE;
    }

    public LoginDbService getLoginService(){
        return new LoginDbServiceImpl();
    }
}
