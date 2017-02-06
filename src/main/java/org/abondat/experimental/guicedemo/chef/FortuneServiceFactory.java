package org.abondat.experimental.guicedemo.chef;

/**
 * Created by alexabon on 2/6/2017.
 */
public class FortuneServiceFactory {
    private FortuneServiceFactory(){}

    private static FortuneService fortuneService = new FortuneServiceImpl();

    public static FortuneService getFortuneService(){
        return fortuneService;
    }

    public static void setFortuneService(FortuneService mockFortuneService){
        fortuneService = mockFortuneService;
    }
}
