package com.bak.paw;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@ApplicationScoped
@ParametersAreNonnullByDefault
public class BookService {

    @Inject
    BookRepository bookRepository;

    public Book findAny(final String name) {
        return bookRepository.findAny(name);
    }

    public List<Book> findAllFromDb() {
        return bookRepository.findAllFromDb();
    }

    public List<Book> addBook(final Book book) {
        bookRepository.putDataToDB(book);
        return findAllFromDb();
    }

    public Book deleteBook(final Book book) {
        return bookRepository.deleteByName(book);
    }
}
