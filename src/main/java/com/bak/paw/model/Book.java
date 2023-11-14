package com.bak.paw.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@Entity
@Table(name = "Book")
@Builder
public class Book {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    public UUID id;


//    @Id
//    Long id;
    @Column
    String bookName;
    @Column
    String author;
    @Column
    String pageAmount;

}
