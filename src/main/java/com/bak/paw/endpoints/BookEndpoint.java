package com.bak.paw.endpoints;

import com.bak.paw.model.Book;
import com.bak.paw.service.BookService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;


@Path("/book")
public class BookEndpoint {

    @Inject
    BookService bookService;

    @POST
    @Path("/getOneBookByName")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.APPLICATION_JSON)
    public Book findByName(final String name) {
        return bookService.findByName(name);
    }

    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getAll() {
        return bookService.findAllFromDb();
    }

    @POST
    @Path("/addBook")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Book add(final Book book) {
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
