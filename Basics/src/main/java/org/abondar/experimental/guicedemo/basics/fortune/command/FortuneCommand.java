package org.abondar.experimental.guicedemo.basics.fortune.command;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.abondar.experimental.guicedemo.basics.command.Command;
import org.abondar.experimental.guicedemo.basics.fortune.Chef;
import org.abondar.experimental.guicedemo.basics.fortune.module.MegaModule;

public class FortuneCommand implements Command {
    @Override
    public void execute() {
        Injector i = Guice.createInjector(new MegaModule());
        Chef chef = i.getInstance(Chef.class);
        chef.makeFortuneCookie();
    }
}
