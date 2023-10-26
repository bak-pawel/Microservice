package com.bak.paw;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/hello")
public class GreetingResource {

    @Inject
    BookRepository bookRepository;

    @GET
    @Path("/getOneBook")
    @Produces(MediaType.APPLICATION_JSON)
    public Book hello() {
        Book book = bookRepository.findAny();
        return book;
    }

    @GET
    @Path("/get")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloFirst() {
        return "book";
    }
}
