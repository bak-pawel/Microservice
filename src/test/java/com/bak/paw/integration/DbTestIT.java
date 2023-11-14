package com.bak.paw.integration;

import com.bak.paw.IntegrationTest;
import com.bak.paw.model.Book;
import com.bak.paw.repository.BookRepository;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;



@IntegrationTest
public class DbTestIT {
    @Inject
    BookRepository bookRepository;

    @Test
    public void findAllFromDb() {
        List<Book> allFromDb = bookRepository.findAllFromDb();
        assertThat(allFromDb).extracting(Book::getBookName).containsExactly("");
    }

}
