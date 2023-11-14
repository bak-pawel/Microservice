package com.bak.paw.repository;

import com.bak.paw.model.Book;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;

@ApplicationScoped
@ParametersAreNonnullByDefault
@Transactional
public class BookRepository implements PanacheRepository<Book> {
    public Book findAny(final String name) {
        return find("bookName", name).firstResult();
    }

    public List<Book> findAllFromDb() {
        return listAll();
    }

    public Book putDataToDB(final Book book) {
        persist(book);
        return book;

    }

    public Book deleteByName(final Book book) {
        delete("bookName", book.getBookName());
        return book;
    }
}
