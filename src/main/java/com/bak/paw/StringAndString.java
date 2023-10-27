package com.bak.paw;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class StringAndString {

        @POST
        @Path("/test")
        @Produces(MediaType.TEXT_PLAIN)
        public String hello(String name) {
            return String.format("Hello %s, how are you?", name) ;
        }
}
