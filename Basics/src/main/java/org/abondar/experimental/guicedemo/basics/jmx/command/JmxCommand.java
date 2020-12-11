package org.abondar.experimental.guicedemo.basics.jmx.command;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import com.google.inject.tools.jmx.Manager;
import org.abondar.experimental.guicedemo.basics.command.Command;
import org.abondar.experimental.guicedemo.basics.jmx.bean.DemoMBean;
import org.abondar.experimental.guicedemo.basics.jmx.bean.DemoMBeanImpl;
import org.abondar.experimental.guicedemo.basics.jmx.log.DebugLog;

import javax.management.MBeanServer;
import java.lang.management.ManagementFactory;

public class JmxCommand implements Command {
    @Override
    public void execute() {
        DebugLog.enable();
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(MBeanServer.class)
                        .toInstance(ManagementFactory.getPlatformMBeanServer());

                bind(DemoMBean.class)
                        .to(DemoMBeanImpl.class)
                        .asEagerSingleton();
            }
        });

        Manager.manage("Test binding",injector);

        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException ex){
            System.err.println(ex.getMessage());
            System.exit(1);
        }

    }
}
