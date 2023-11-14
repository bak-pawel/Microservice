package com.bak.paw.service;

import com.bak.paw.UnitTest;
import com.bak.paw.model.Book;
import com.bak.paw.repository.BookRepository;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@UnitTest
@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    Logger log;

    @Mock
    BookRepository bookRepository;

    @InjectMocks
    BookService unitUnderTest;

    @Test
    public void findByName() {
        when(bookRepository.findAny(any())).thenReturn(renderBook());
        assertThat(unitUnderTest.findByName("Dziady")).extracting(Book::getBookName).isEqualTo("Dziady");
    }
    @Test
    public void findAll() {
        when(bookRepository.findAllFromDb()).thenReturn(List.of());
        assertThat(unitUnderTest.findAllFromDb()).hasSize(0);
    }
    @Test
    public void addBook() {
        when(bookRepository.putDataToDB(any())).thenReturn(renderBook());
        assertThat(unitUnderTest.addBook(renderBook())).extracting(Book::getBookName).isEqualTo("Dziady");
    }
    @Test
    public void deleteBook() {
        when(bookRepository.deleteByName(any())).thenReturn(renderBook());
        assertThat(unitUnderTest.deleteBook(renderBook())).extracting(Book::getBookName).isEqualTo("Dziady");
    }
    private Book renderBook() {
        return Book.builder()
                .id(UUID.randomUUID())
                .bookName("Dziady")
                .pageAmount("234")
                .author("Adam Mickiewicz")
                .build();

    }
}