package org.abondar.experimental.guicedemo.basics.customscope;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by alexabon on 2/7/2017.
 */
public class CustomScopeMain {
    public static void main(String[] args) {
        Injector i = Guice.createInjector(new AppModule());
        i.getInstance(Person.class);
        i.getInstance(Person.class);

    }
}
