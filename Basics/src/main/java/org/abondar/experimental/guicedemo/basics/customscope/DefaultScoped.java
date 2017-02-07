package org.abondar.experimental.guicedemo.basics.customscope;

/**
 * Created by alexabon on 2/7/2017.
 */

import com.google.inject.ScopeAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@ScopeAnnotation
public @interface DefaultScoped {}
