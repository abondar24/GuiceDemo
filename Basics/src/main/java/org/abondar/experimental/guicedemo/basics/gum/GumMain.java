package org.abondar.experimental.guicedemo.basics.gum;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by alexabon on 2/6/2017.
 */
public class GumMain {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GumModule());
        GumballMachine machine = injector.getInstance(GumballMachine.class);
        System.out.println(machine.dispense());
        System.out.println(machine.dispense());
    }
}
