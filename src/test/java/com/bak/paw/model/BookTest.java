package com.bak.paw.model;

import com.bak.paw.UnitTest;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;

@UnitTest
@ExtendWith(MockitoExtension.class)
class BookTest {

    @Mock
    Logger log;

    @InjectMocks
    Book unitUnderTest;

    @Test
    public void getName() {
        UUID uuid = UUID.randomUUID();
        Book book = renderBook(uuid);
        assertThat(book).extracting(Book::getBookName).isEqualTo("Dziady");
    }

    @Test
    public void getId() {
        UUID uuid = UUID.randomUUID();
        Book book = renderBook(uuid);
        assertThat(book).extracting(Book::getId).isEqualTo(uuid);
    }

    @Test
    public void getPageAmount() {
        UUID uuid = UUID.randomUUID();

        Book book = renderBook(uuid);
        assertThat(book).extracting(Book::getPageAmount).isEqualTo("233");
    }

    @Test
    public void getAuthor() {
        UUID uuid = UUID.randomUUID();
        Book book = renderBook(uuid);
        assertThat(book).extracting(Book::getAuthor).isEqualTo("Adam Mickiewicz");
    }

    private Book renderBook(UUID uuid){
        return Book.builder()
                .id(uuid)
                .bookName("Dziady")
                .pageAmount("233")
                .author("Adam Mickiewicz")
                .build();
    }
}