package org.abondar.experimental.guicedemo.basics.properties;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

/**
 * Created by alexabon on 2/6/2017.
 */
public class PropertiesMain {

    @Inject
    public void dataBaseURL(@Named("db.url") String url){
        System.out.println(url);
    }

    public static void main(String[] args) {
        Injector i = Guice.createInjector(new PropertiesModule());
        i.getInstance(PropertiesMain.class);
    }

}
