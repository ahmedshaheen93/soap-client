package com.shaheen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.JaxWsPortProxyFactoryBean;
import com.shaheen.model.CalculatorSoap;

import java.net.MalformedURLException;
import java.net.URL;

@Configuration
public class Config {

    @Bean
    public JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean() {
        JaxWsPortProxyFactoryBean jaxWsPortProxyFactoryBean = new JaxWsPortProxyFactoryBean();
        jaxWsPortProxyFactoryBean.setServiceInterface(CalculatorSoap.class);
        try {
            jaxWsPortProxyFactoryBean.setWsdlDocumentUrl(new URL("http://www.dneonline.com/calculator.asmx?WSDL"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        jaxWsPortProxyFactoryBean.setServiceName("Calculator");
        jaxWsPortProxyFactoryBean.setPortName("CalculatorSoap");
        return jaxWsPortProxyFactoryBean;
    }
}
