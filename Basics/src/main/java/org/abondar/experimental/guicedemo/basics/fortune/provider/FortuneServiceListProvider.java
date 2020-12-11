package org.abondar.experimental.guicedemo.basics.fortune.provider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.abondar.experimental.guicedemo.basics.fortune.Funny;
import org.abondar.experimental.guicedemo.basics.fortune.Quote;
import org.abondar.experimental.guicedemo.basics.fortune.service.FortuneService;

import java.util.Arrays;
import java.util.List;

public class FortuneServiceListProvider implements Provider<List<FortuneService>> {

    @Inject
    @Quote
    private FortuneService quoteService;

    @Inject
    @Funny
    private FortuneService funnyService;


    @Override
    public List<FortuneService> get() {
        return Arrays.asList(quoteService,funnyService);
    }
}
