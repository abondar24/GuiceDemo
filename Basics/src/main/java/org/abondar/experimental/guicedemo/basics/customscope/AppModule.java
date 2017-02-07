package org.abondar.experimental.guicedemo.basics.customscope;

import com.google.inject.AbstractModule;

/**
 * Created by alexabon on 2/7/2017.
 */
public class AppModule extends AbstractModule{
    @Override
    protected void configure() {
        install( new CustomScopeByAnnotationModule());
        install(new CustomScopeModule());
    }
}
