package com.lib.management.ui.common;

import com.lib.management.domain.factory.DomainFactory;

public class ModuleFactory {
    private ModuleFactory(){}

    private final static class ModuleFactoryInjector{
        private final static ModuleFactory INSTANCE = new ModuleFactory();
    }

    public static ModuleFactory getInstance(){
        return ModuleFactoryInjector.INSTANCE;
    }

    public DomainFactory getDomainFactory(){
        return DomainFactory.getInstance();
    }
}
