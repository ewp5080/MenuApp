package com.ericpanulla.testgradle;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ewp5080 on 11/1/2016.
 */
@Path("/")
public class HelloWorldService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getMsg() {
        return "Hello";
    }
}
