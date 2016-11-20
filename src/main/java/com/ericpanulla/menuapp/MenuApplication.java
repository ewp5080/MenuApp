package com.ericpanulla.menuapp;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ewp5080 on 11/1/2016.
 */
public class MenuApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>();
        classes.add(HelloWorldService.class);
        return classes;
    }
}
