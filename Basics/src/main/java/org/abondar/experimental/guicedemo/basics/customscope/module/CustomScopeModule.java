package org.abondar.experimental.guicedemo.basics.customscope.module;

import com.google.inject.AbstractModule;
import org.abondar.experimental.guicedemo.basics.customscope.CustomScopes;
import org.abondar.experimental.guicedemo.basics.customscope.Person;

/**
 * Created by alexabon on 2/7/2017.
 */
public class CustomScopeModule  extends AbstractModule{
    @Override
    protected void configure() {

        bind(Person.class).in(CustomScopes.DEFAULT);
    }
}
