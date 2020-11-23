package org.abondar.experimental.guicedemo.basics.fortune.module;

import com.google.inject.Binder;
import com.google.inject.Module;
import org.abondar.experimental.guicedemo.basics.fortune.service.FortuneService;
import org.abondar.experimental.guicedemo.basics.fortune.service.FortuneServiceImpl;

/**
 * Created by alexabon on 2/6/2017.
 */
public class ChefModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(FortuneService.class)
                .to(FortuneServiceImpl.class);

    }
}
