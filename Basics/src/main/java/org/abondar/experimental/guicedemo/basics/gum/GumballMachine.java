package org.abondar.experimental.guicedemo.basics.gum;

import com.google.inject.Inject;
import com.google.inject.Provider;


/**
 * Created by alexabon on 2/6/2017.
 */
public class GumballMachine {

    @Inject
    private Provider<Gum> gumProvider;

    public Gum dispense(){
        return gumProvider.get();
    }
}
