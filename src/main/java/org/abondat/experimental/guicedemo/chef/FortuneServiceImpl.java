package org.abondat.experimental.guicedemo.chef;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by alexabon on 2/6/2017.
 */
public class FortuneServiceImpl implements FortuneService {

    private static final List<String> MESSAGES = Arrays.asList(
            "I like salo",
            "Vodka is shit");


    @Override
    public String randomFortune() {
        return MESSAGES.get(new Random().nextInt(MESSAGES.size()));
    }
}
