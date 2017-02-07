package org.abondar.experimental.guicedemo.basics.customscope;

/**
 * Created by alexabon on 2/7/2017.
 */
@DefaultScoped
public class Person {
    public Person(){
        System.out.printf("Hi, I'm a Person. With hashcode '%s', I'm unique!%n",
                super.hashCode());
    }
}
