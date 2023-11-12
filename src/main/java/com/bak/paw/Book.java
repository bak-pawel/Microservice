package com.bak.paw;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Entity
@Table(name = "Book")
@Builder
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
