package org.abondar.experimental.guicedemo.basics.fortune.service;

import javax.inject.Inject;
import java.util.List;
import java.util.Random;

/**
 * Created by alexabon on 2/6/2017.
 */
public class FortuneServiceImpl implements FortuneService {

    private final List<String> messages;

    @Inject
    public FortuneServiceImpl (List<String> messages){
        this.messages = messages;
    }

    @Override
    public String randomFortune() {
        return messages.get(new Random().nextInt(messages.size()));
    }
}
