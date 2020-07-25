package com.shaheen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import org.springframework.stereotype.Service;
import com.shaheen.model.CalculatorSoap;

@Service("serviceFacade")
public class ServiceFacadeImpl implements ServiceFacade {
    @Autowired
    private JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean;
    @Override
    public CalculatorSoap getCalculator() {
        return (CalculatorSoap) jaxWsPortProxyFactoryBean.getObject();
    }
}
