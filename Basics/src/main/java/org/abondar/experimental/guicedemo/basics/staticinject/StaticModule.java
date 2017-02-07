package org.abondar.experimental.guicedemo.basics.staticinject;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created by alexabon on 2/6/2017.
 */
public class StaticModule extends AbstractModule {
    @Override
    protected void configure() {
        bindConstant().annotatedWith(Names.named("s")).to("D'OH!");
        requestStaticInjection(StaticInjectionMain.class);
    }
}
