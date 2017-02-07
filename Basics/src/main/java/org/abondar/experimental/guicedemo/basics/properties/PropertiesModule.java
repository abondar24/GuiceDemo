package org.abondar.experimental.guicedemo.basics.properties;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * Created by alexabon on 2/6/2017.
 */
public class PropertiesModule extends AbstractModule {
    @Override
    protected void configure() {
        try {
            Properties dbProps = loadProperties("db.properties");
            Names.bindProperties(binder(), dbProps);
        } catch (RuntimeException e) {
            addError("Couldn't configure properties", e);
        }

    }


    private static Properties loadProperties(String name) {
        Properties properties = new Properties();
        InputStream is = new Object() {}
                .getClass()
                .getClassLoader()
                .getResourceAsStream(name);

        try {
            properties.load(is);
        } catch (IOException e){
            throw new RuntimeException(e);
        } finally {
            if (is !=null){
                try {
                    is.close();
                } catch (IOException dontCare){}
            }
        }
        return properties;
    }
}
