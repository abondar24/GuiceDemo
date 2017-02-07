package org.abondar.experimental.guicedemo.basics.gum;

import com.google.inject.AbstractModule;

/**
 * Created by alexabon on 2/6/2017.
 */
public class GumModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Gum.class).toProvider(GumProvider.class);
    }
}
