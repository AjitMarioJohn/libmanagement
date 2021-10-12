package com.lib.management.domain.factory;

import com.lib.management.domain.service.LoginDomainService;

public interface DomainServiceFactory {
    LoginDomainService getLoginDomainService();
}
