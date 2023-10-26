package com.bak.paw;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import javax.annotation.ParametersAreNonnullByDefault;

@ApplicationScoped
@ParametersAreNonnullByDefault
public class BookRepository implements PanacheRepository<Book> {
    public Book findAny() {
        return find("bookName", "Dziady").firstResult();
    }
}
