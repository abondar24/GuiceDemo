package org.abondar.experimental.guicedemo.basics.customscope;

import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.Scope;

/**
 * Created by alexabon on 2/7/2017.
 */
public class CustomScopes {
    public static final Scope DEFAULT = new Scope() {
        @Override
        public <T> Provider<T> scope(Key<T> key, Provider<T> provider) {
            System.out.println("Scoping " +key);
            return provider;
        }

        public String toString(){
            return CustomScopes.class.getSimpleName()+".DEFAULT";
        }
    };
}
