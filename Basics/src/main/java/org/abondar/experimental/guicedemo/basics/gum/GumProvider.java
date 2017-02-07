package org.abondar.experimental.guicedemo.basics.gum;

import com.google.inject.Provider;

/**
 * Created by alexabon on 2/6/2017.
 */
public class GumProvider implements Provider<Gum> {
    @Override
    public Gum get() {
        return new Gum();
    }
}
