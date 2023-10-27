package com.bak.paw;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path("/book")
public class GreetingResource {

    @Inject
    BookService bookService;

    @POST
    @Path("/getOneBookByName")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Book findBookByName(final String name) {
        Book book = bookService.findAny(name);
        return book;
    }

    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAllBooks() {
        return bookService.findAllFromDb();
    }

    @POST
    @Path("/addBook")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> addBookToDb(final Book book) {
        return bookService.addBook(book);
    }

    @DELETE
    @Path("/deleteBook")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(final Book book) {
        bookService.deleteBook(book);
    }
}
