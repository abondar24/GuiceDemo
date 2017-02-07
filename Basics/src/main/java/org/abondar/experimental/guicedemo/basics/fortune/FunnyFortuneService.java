package org.abondar.experimental.guicedemo.basics.fortune;

/**
 * Created by alexabon on 2/6/2017.
 */
public class FunnyFortuneService implements FortuneService{
    @Override
    public String randomFortune() {
        return "Web Sarvar, Web sarvar varseees..";
    }
}
