package org.abondar.experimental.guicedemo.basics.properties;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import org.abondar.experimental.guicedemo.basics.command.Command;

/**
 * Created by alexabon on 2/6/2017.
 */
public class PropertiesCommand implements Command {

    @Inject
    public void dataBaseURL(@Named("db.url") String url){
        System.out.println(url);
    }


    @Override
    public void execute() {
        Injector i = Guice.createInjector(new PropertiesModule());
        i.getInstance(PropertiesCommand.class);
    }
}
