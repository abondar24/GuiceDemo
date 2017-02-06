package org.abondat.experimental.guicedemo.fortune;

import com.google.inject.AbstractModule;

/**
 * Created by alexabon on 2/6/2017.
 */
public class BindingAnnotationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FortuneService.class).to(FortuneServiceImpl.class);
        bind(FortuneService.class).annotatedWith(Mega.class)
        .to(MegaFortuneService.class);

    }
}
