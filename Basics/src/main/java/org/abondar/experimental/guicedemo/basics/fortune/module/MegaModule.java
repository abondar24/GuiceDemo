package org.abondar.experimental.guicedemo.basics.fortune.module;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.TypeLiteral;
import org.abondar.experimental.guicedemo.basics.fortune.Funny;
import org.abondar.experimental.guicedemo.basics.fortune.Mega;
import org.abondar.experimental.guicedemo.basics.fortune.Quote;
import org.abondar.experimental.guicedemo.basics.fortune.provider.FortuneListProvider;
import org.abondar.experimental.guicedemo.basics.fortune.provider.FortuneServiceListProvider;
import org.abondar.experimental.guicedemo.basics.fortune.service.FortuneService;
import org.abondar.experimental.guicedemo.basics.fortune.service.FortuneServiceImpl;
import org.abondar.experimental.guicedemo.basics.fortune.service.FunnyFortuneService;
import org.abondar.experimental.guicedemo.basics.fortune.service.MegaFortuneService;
import org.abondar.experimental.guicedemo.basics.fortune.service.QuoteFortuneService;

import java.util.List;

/**
 * Created by alexabon on 2/6/2017.
 */
public class MegaModule extends AbstractModule {
    @Override
    protected void configure() {

        bind(FortuneService.class)
                .to(FortuneServiceImpl.class);

        bind(FortuneService.class)
                .annotatedWith(Funny.class)
                .to(FunnyFortuneService.class);

        bind(FortuneService.class)
                .annotatedWith(Quote.class)
                .to(QuoteFortuneService.class);

        bind(FortuneService.class)
                .annotatedWith(Mega.class)
                .to(MegaFortuneService.class);

        bind(new TypeLiteral<List<String>>(){})
                .toProvider(new FortuneListProvider())
                .in(Singleton.class);


        bind(new TypeLiteral<List<FortuneService>>(){})
                .toProvider(new FortuneServiceListProvider())
                .in(Singleton.class);



    }
}
