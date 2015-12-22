/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iviettech.resource;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Nguyen Ngoc Anh
 */
@Path("hello")
public class HelloRest {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of HelloRest
     */
    public HelloRest() {
    }

    /**
     * Retrieves representation of an instance of com.iviettech.resource.HelloRest
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        return "Hello! How are you today?";
    }
    
    @GET
    @Path("/welcome")
    @Produces(MediaType.TEXT_PLAIN)
    public String welcome(){
        return "Welcome to RESTful";
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@QueryParam(value = "name")
                            String name){
        return "Hello " + name + "! How are you today?";
    }
    
    @GET
    @Path("/say/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String say(@PathParam(value = "name")
                            String name){
        return "Hello " + name + "! How are you today?";
    }
    
    /**
     * PUT method for updating or creating an instance of HelloRest
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}
