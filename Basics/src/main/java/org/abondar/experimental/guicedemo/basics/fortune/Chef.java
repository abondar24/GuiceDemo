package org.abondar.experimental.guicedemo.basics.fortune;

import com.google.inject.Inject;
import org.abondar.experimental.guicedemo.basics.fortune.service.FortuneService;

/**
 * Created by alexabon on 2/6/2017.
 */
public class Chef {
    private final FortuneService service;

    @Inject
    public Chef(@Funny FortuneService service){
        this.service = service;
    }

    public void makeFortuneCookie(){
        new FortuneCookie(service.randomFortune());
    }
}
