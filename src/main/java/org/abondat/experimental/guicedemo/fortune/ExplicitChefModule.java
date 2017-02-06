package org.abondat.experimental.guicedemo.fortune;

import com.google.inject.AbstractModule;

/**
 * Created by alexabon on 2/6/2017.
 */
public class ExplicitChefModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Chef.class);
    }
}
