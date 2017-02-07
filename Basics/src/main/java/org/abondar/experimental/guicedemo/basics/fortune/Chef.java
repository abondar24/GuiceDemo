package org.abondar.experimental.guicedemo.basics.fortune;

import com.google.inject.Inject;

/**
 * Created by alexabon on 2/6/2017.
 */
public class Chef {
    private final FortuneService service;

    @Inject
    public Chef(@Mega FortuneService service){
        this.service = service;
    }

    public void makeFortuneCookie(){
        new FortuneCookie(service.randomFortune());
    }
}
