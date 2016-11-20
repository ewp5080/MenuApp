package com.ericpanulla.menuapp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ewp5080 on 11/1/2016.
 */
@Path("/hello")
public class HelloWorldService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMsg() {
        return "Hello";
    }
}
