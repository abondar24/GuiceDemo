package org.abondar.experimental.guicedemo.basics.jmx.bean;

import com.google.inject.Inject;

import javax.management.JMException;
import javax.management.MBeanServer;
import javax.management.ObjectName;

public class DemoMBeanImpl implements DemoMBean{
    @Override
    public void sayHello() {
        System.out.println("Hiii");
    }

    @Inject
    public void registerBean(MBeanServer server){
        try {
            server.registerMBean(
                    this,new ObjectName("Demo Guice JMX bean")
            );
        } catch (JMException ex){
            System.err.println(ex.getMessage());
            System.exit(2);
        }
    }
}
