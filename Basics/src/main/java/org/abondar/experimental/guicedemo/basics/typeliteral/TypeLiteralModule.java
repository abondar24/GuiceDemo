package org.abondar.experimental.guicedemo.basics.typeliteral;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;
import com.google.inject.name.Names;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexabon on 2/6/2017.
 */
public class TypeLiteralModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(listOf(String.class))
                .annotatedWith(Names.named("list"))
                .to(arrayListOf(String.class));
        bind(listOf(Integer.class))
                .annotatedWith(Names.named("list"))
                .to(arrayListOf(Integer.class));

    }

    @SuppressWarnings("unchecked")
    static <T> TypeLiteral<List<T>> listOf(final Class<T> parameterType) {
        return (TypeLiteral<List<T>>) TypeLiteral.get(new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[]{parameterType};
            }

            @Override
            public Type getRawType() {
                return List.class;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }
        });
    }

    @SuppressWarnings("unchecked")
    static <T> TypeLiteral<ArrayList<T>> arrayListOf(final Class<T> parameterType) {
        return (TypeLiteral<ArrayList<T>>) TypeLiteral.get(new ParameterizedType() {
            @Override
            public Type[] getActualTypeArguments() {
                return new Type[]{parameterType};
            }

            @Override
            public Type getRawType() {
                return ArrayList.class;
            }

            @Override
            public Type getOwnerType() {
                return null;
            }
        });
    }
}
