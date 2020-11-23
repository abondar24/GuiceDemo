package org.abondar.experimental.guicedemo.basics.customscope.module;

import com.google.inject.AbstractModule;
import org.abondar.experimental.guicedemo.basics.customscope.CustomScopes;
import org.abondar.experimental.guicedemo.basics.customscope.DefaultScoped;

/**
 * Created by alexabon on 2/7/2017.
 */
public class CustomScopeByAnnotationModule extends AbstractModule {
    @Override
    protected void configure() {
        bindScope(DefaultScoped.class, CustomScopes.DEFAULT);
    }
}
