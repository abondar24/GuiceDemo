package org.abondar.experimental.guicedemo.basics.fortune.service;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by alexabon on 2/6/2017.
 */
public class MegaFortuneService implements FortuneService {

    private final List<FortuneService> services;

    @Inject
    public MegaFortuneService(List<FortuneService> services) {
        this.services = services;
    }

    @Override
    public String randomFortune() {
        int index = new Random().nextInt(services.size());
        return services.get(index).randomFortune();
    }
}
