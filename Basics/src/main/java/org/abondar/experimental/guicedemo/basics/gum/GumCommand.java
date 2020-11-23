package org.abondar.experimental.guicedemo.basics.gum;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.abondar.experimental.guicedemo.basics.command.Command;

/**
 * Created by alexabon on 2/6/2017.
 */
public class GumCommand implements Command {


    @Override
    public void execute() {
        Injector injector = Guice.createInjector(new GumModule());
        GumballMachine machine = injector.getInstance(GumballMachine.class);
        System.out.println(machine.dispense());
        System.out.println(machine.dispense());
    }
}
