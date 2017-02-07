package org.abondar.experimental.guicedemo.basics.typeliteral;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by alexabon on 2/6/2017.
 */
public class TypedLiteralMain {
    public static void main(String[] args) {
        Injector i = Guice.createInjector(new TypeLiteralModule());
        System.out.println(i.getInstance(ListUser.class));
    }
}
