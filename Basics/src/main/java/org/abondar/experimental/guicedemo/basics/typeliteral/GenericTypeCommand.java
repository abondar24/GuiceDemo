package org.abondar.experimental.guicedemo.basics.typeliteral;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.abondar.experimental.guicedemo.basics.command.Command;

/**
 * Created by alexabon on 2/6/2017.
 */
public class GenericTypeCommand implements Command {

    @Override
    public void execute() {
        Injector i = Guice.createInjector(new TypeLiteralModule());
        System.out.println(i.getInstance(ListUser.class));
    }
}
