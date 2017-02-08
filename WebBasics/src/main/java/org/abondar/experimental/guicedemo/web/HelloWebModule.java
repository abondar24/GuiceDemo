package org.abondar.experimental.guicedemo.web;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created by alexabon on 2/7/2017.
 */
public class HelloWebModule extends AbstractModule {
    @Override
    protected void configure() {
        bindConstant().annotatedWith(Names.named("app.name")).to("Hello Servlet");
    }
}
