package com.worldline.quarkus;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/{user}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String helloUser(@PathParam("user") String userName){
        return "hello "+userName;
    }

    @GET
    @Path("/{user}/{age}")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String birthday(@PathParam("user") String userName, @PathParam("age") String age){
        return "Bon anniversaire "+userName+ " pour tes "+age+ " !";
    }



}
