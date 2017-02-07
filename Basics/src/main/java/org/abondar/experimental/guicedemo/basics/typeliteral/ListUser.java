package org.abondar.experimental.guicedemo.basics.typeliteral;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import java.util.List;

/**
 * Created by alexabon on 2/6/2017.
 */
public class ListUser {

    @Inject
    @Named("list")
    List<String> strings;

    @Inject
    @Named("list")
    List<Integer> integers;

    public String toString(){
        return String.format("%s[strings=%s,integers=%s]",
                getClass().getName(),
                System.identityHashCode(strings),
                System.identityHashCode(integers));
    }
}
