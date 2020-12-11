package org.abondar.experimental.guicedemo.basics.fortune.service;

/**
 * Created by alexabon on 2/6/2017.
 */
public class QuoteFortuneService implements FortuneService{
    @Override
    public String randomFortune() {
        return "Bro for Bro - Jason Statham";
    }
}
