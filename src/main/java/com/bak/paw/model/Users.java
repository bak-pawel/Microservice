package com.bak.paw.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Data
@Entity
@Table(name = "Users")
public class Users {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    public UUID id;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    String street;

    @Column
    String homeNumber;

    @Column
    long flatNumber;


}
