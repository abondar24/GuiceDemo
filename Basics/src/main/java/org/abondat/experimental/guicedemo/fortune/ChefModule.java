package org.abondat.experimental.guicedemo.fortune;

import com.google.inject.Binder;
import com.google.inject.Module;

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
