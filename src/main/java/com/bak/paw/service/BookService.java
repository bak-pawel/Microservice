package com.bak.paw.service;

import com.bak.paw.model.Book;
import com.bak.paw.repository.BookRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@ApplicationScoped
@ParametersAreNonnullByDefault
public class BookService {

    @Inject
    BookRepository bookRepository;

    public Book findByName(final String name) {
        return bookRepository.findAny(name);
    }

    public List<Book> findAllFromDb() {
        return bookRepository.findAllFromDb();
    }

    public Book addBook(final Book book) {
        return bookRepository.putDataToDB(book);
    }

    public void deleteBook(final Book book) {
        bookRepository.deleteByName(book);
    }
}
