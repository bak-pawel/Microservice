package com.bak.paw;

import com.bak.paw.model.Book;
import com.bak.paw.service.BookService;
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
public class BookEndpointTest {

    @Mock
    BookService bookService;

    @InjectMocks
    BookEndpoint unitUnderTest;

    @Test
    public void findAll() {
        when(bookService.findAllFromDb()).thenReturn(getAllBooks());
        assertThat(unitUnderTest.getAll()).hasSize(2);
    }

    @Test
    public void findBookByName() {
        when(bookService.findByName(any())).thenReturn(getOneBook());
        assertThat(unitUnderTest.findByName("Dziady")).extracting(Book::getBookName).isEqualTo("Dziady");
    }

    @Test
    public void addBook(){
        when(bookService.addBook(any())).thenReturn(getOneBook());
        assertThat(unitUnderTest.add(getOneBook())).extracting(Book::getBookName).isEqualTo("Dziady");
    }

    @Test
    public void deleteBook(){
        when(bookService.deleteBook(any())).thenReturn(getOneBook());
        assertThat(unitUnderTest.delete(getOneBook())).extracting(Book::getBookName).isEqualTo("Dziady");
    }

    private List<Book> getAllBooks() {
        return List.of(Book.builder()
                        .id(UUID.randomUUID())
                        .bookName("Dziady")
                        .pageAmount("233")
                        .author("Adam Mickiewicz")
                        .build(),
                Book.builder()
                        .id(UUID.randomUUID())
                        .bookName("Romeo i Julia")
                        .pageAmount("123")
                        .author("William Shakespeare")
                        .build());

    }
    private Book getOneBook(){
       return Book.builder()
                .id(UUID.randomUUID())
                .bookName("Dziady")
                .pageAmount("233")
                .author("Adam Mickiewicz")
                .build();
    }

}