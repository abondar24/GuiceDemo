package org.abondar.experimental.guicedemo.basics.staticinject;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.abondar.experimental.guicedemo.basics.command.Command;

/**
 * Created by alexabon on 2/6/2017.
 */
public class StaticInjectionCommand implements Command {

    @Inject
    public static void staticMethod(@Named("s") String str){
        System.out.println(str);
    }


    @Override
    public void execute() {
        Guice.createInjector(new StaticModule());
    }
}
