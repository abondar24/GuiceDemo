package org.abondar.experimental.guicedemo.web;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by alexabon on 2/7/2017.
 */
public class GuiceServletContextListener implements ServletContextListener {
    public static final String KEY = Injector.class.getName();

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().setAttribute(KEY, getInjector());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().removeAttribute(KEY);
    }

    private Injector getInjector(){
        return Guice.createInjector(new HelloWebModule());
    }
}
