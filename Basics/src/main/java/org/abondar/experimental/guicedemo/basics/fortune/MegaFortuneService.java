package org.abondar.experimental.guicedemo.basics.fortune;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by alexabon on 2/6/2017.
 */
public class MegaFortuneService implements FortuneService {
    private static final List<FortuneService> SERVICES = Arrays.<FortuneService>asList(
            new FunnyFortuneService(),
            new QuoteFortuneSerivce()
            );

    @Override
    public String randomFortune() {
        int index = new Random().nextInt(SERVICES.size());
        return SERVICES.get(index).randomFortune();
    }
}
