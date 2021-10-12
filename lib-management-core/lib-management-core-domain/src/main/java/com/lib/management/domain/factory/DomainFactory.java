package com.lib.management.domain.factory;

import com.lib.management.domain.factory.impl.DomainServiceFactoryImpl;

public final class DomainFactory {
    private DomainFactory(){}

    private final static class DomainFactoryInjector {
        private final static DomainFactory INSTANCE = new DomainFactory();
    }

    public static DomainFactory getInstance(){
        return DomainFactoryInjector.INSTANCE;
    }

    public DomainServiceFactory getDomainServiceFactoryInstance(){
        return new DomainServiceFactoryImpl();
    }
}
