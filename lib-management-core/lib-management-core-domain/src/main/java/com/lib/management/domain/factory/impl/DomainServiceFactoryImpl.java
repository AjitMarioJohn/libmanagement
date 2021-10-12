package com.lib.management.domain.factory.impl;

import com.lib.management.domain.factory.DomainServiceFactory;
import com.lib.management.domain.service.LoginDomainService;
import com.lib.management.domain.service.impl.LoginDomainServiceImpl;

public final class DomainServiceFactoryImpl implements DomainServiceFactory {

    @Override
    public LoginDomainService getLoginDomainService() {
        return new LoginDomainServiceImpl();
    }

}
