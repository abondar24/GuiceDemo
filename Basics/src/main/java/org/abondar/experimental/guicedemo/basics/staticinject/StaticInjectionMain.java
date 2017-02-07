package org.abondar.experimental.guicedemo.basics.staticinject;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Created by alexabon on 2/6/2017.
 */
public class StaticInjectionMain {

    @Inject
    public static void staticMethod(@Named("s") String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        Guice.createInjector(new StaticModule());
    }

}
