package org.abondar.experimental.guicedemo.basics.fortune.provider;

import com.google.inject.Provider;

import java.util.Arrays;
import java.util.List;

public class FortuneListProvider implements Provider<List<String>> {
    @Override
    public List<String> get() {
        return Arrays.asList(
           "I like salo", "Vodka is shit");
    }
}
