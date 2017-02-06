package org.abondat.experimental.guicedemo.chef;

/**
 * Created by alexabon on 2/6/2017.
 */
public class Chef {
    private FortuneService service;

    public Chef(){
        service = FortuneServiceFactory.getFortuneService();
    }

    public void makeFortuneCookie(){
        new FortuneCookie(service.randomFortune());
    }
}
