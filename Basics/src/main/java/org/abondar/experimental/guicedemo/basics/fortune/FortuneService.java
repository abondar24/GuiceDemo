package org.abondar.experimental.guicedemo.basics.fortune;

import com.google.inject.ImplementedBy;

/**
 * Created by alexabon on 2/6/2017.
 */
//can be used instead of modules
//@ImplementedBy(FortuneServiceImpl.class)
public interface FortuneService {
    String randomFortune();
}
