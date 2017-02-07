package org.abondar.experimental.guicedemo.basics.concert;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by alexabon on 2/6/2017.
 */
public class ConcertMain {
    public static void main(String[] args) {
        Injector i = Guice.createInjector(new ConcertModule());
        ConcertHall hall = i.getInstance(ConcertHall.class);
        System.out.println(hall);
    }
}
