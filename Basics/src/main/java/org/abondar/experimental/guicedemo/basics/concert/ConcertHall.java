package org.abondar.experimental.guicedemo.basics.concert;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Created by alexabon on 2/6/2017.
 */
public class ConcertHall {

    @Inject
    @Named("capacity")
    private int capacity;

    @Inject
    @Named("stage")
    private Class<?> stageType;

    @Inject
    @Named("setting")
    private Setting setting;

    @Override
    public String toString() {
        return String.format("%s[capacity=%s, stageType=%s, setting=%s]", getClass().getName(),
                capacity, stageType, setting);
    }
}
