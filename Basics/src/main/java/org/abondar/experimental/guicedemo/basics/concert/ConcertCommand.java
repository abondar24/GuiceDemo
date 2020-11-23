package org.abondar.experimental.guicedemo.basics.concert;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.abondar.experimental.guicedemo.basics.command.Command;

/**
 * Created by alexabon on 2/6/2017.
 */
public class ConcertCommand implements Command {

    @Override
    public void execute() {
        Injector i = Guice.createInjector(new ConcertModule());
        ConcertHall hall = i.getInstance(ConcertHall.class);
        System.out.println(hall);
    }
}
