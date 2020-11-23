package org.abondar.experimental.guicedemo.basics.fortune.module;

import com.google.inject.AbstractModule;
import org.abondar.experimental.guicedemo.basics.fortune.Mega;
import org.abondar.experimental.guicedemo.basics.fortune.service.FortuneService;
import org.abondar.experimental.guicedemo.basics.fortune.service.FortuneServiceImpl;
import org.abondar.experimental.guicedemo.basics.fortune.service.MegaFortuneService;

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
