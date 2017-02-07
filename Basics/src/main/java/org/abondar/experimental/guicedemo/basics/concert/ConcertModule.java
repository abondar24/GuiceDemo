package org.abondar.experimental.guicedemo.basics.concert;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created by alexabon on 2/6/2017.
 */
public class ConcertModule extends AbstractModule {
    @Override
    protected void configure() {
        bindConstant()
                .annotatedWith(Names.named("capacity"))
                .to(332);
        bindConstant()
                .annotatedWith(Names.named("stage"))
                .to("org.abondar.experimental.guicedemo.basics.concert.BigStage");
        bindConstant()
                .annotatedWith(Names.named("setting"))
                .to("INDOOR");
    }
}
