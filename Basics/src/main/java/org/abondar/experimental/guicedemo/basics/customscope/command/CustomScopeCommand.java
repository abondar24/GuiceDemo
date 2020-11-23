package org.abondar.experimental.guicedemo.basics.customscope.command;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.abondar.experimental.guicedemo.basics.command.Command;
import org.abondar.experimental.guicedemo.basics.customscope.module.AppModule;
import org.abondar.experimental.guicedemo.basics.customscope.Person;

/**
 * Created by alexabon on 2/7/2017.
 */
public class CustomScopeCommand implements Command {
    @Override
    public void execute() {
        Injector i = Guice.createInjector(new AppModule());
        i.getInstance(Person.class);
        i.getInstance(Person.class);
    }
}
