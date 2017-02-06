package org.abondat.experimental.guicedemo.fortune;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by alexabon on 2/6/2017.
 */
public class FortuneMain {

    public static void main(String[] args) {
        Injector i = Guice.createInjector(new ChefModule());
        Chef chef = i.getInstance(Chef.class);
        chef.makeFortuneCookie();

        Injector i1 = Guice.createInjector(new BindingAnnotationModule());

    }
}
