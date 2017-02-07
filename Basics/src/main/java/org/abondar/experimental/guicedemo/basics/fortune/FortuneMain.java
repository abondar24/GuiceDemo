package org.abondar.experimental.guicedemo.basics.fortune;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by alexabon on 2/6/2017.
 */
public class FortuneMain {

    public static void main(String[] args) {
        //Injector i = Guice.createInjector(new ChefModule());
        //since we have multiple implementations of FortuneService we use bindingAnnotation
        Injector i = Guice.createInjector(new BindingAnnotationModule());
        Chef chef = i.getInstance(Chef.class);
        chef.makeFortuneCookie();

    }
}
