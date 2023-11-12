package com.bak.paw;

import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@UnitTest
@ExtendWith(MockitoExtension.class)
class BookTest {

    @Mock
    Logger log;

    @InjectMocks
    Book unitUnderTest;

    @Test
    public void getName() {
        Book book = renderBook();
        assertThat(book).extracting(Book::getBookName).isEqualTo("Dziady");
    }

    @Test
    public void getId() {
        Book book = renderBook();
        assertThat(book).extracting(Book::getId).isEqualTo(12324l);
    }

    @Test
    public void getPageAmount() {
        Book book = renderBook();
        assertThat(book).extracting(Book::getPageAmount).isEqualTo("233");
    }

    @Test
    public void getAuthor() {
        Book book = renderBook();
        assertThat(book).extracting(Book::getAuthor).isEqualTo("Adam Mickiewicz");
    }

    private Book renderBook(){
        return Book.builder()
                .id(12324l)
                .bookName("Dziady")
                .pageAmount("233")
                .author("Adam Mickiewicz")
                .build();
    }
}