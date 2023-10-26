package com.bak.paw;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Book")
public class Book {
    @Id
    Long id;
    @Column
    String bookName;
    @Column
    String author;
    @Column
    String pageAmount;

}
