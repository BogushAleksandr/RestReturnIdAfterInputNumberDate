package com.example.RestReturnIdAfterInputNumberDate.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "format")
public class Format implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "number")
    private int number;

    @Column(name = "text")
    private String text;

    @Column(name = "date")
    private LocalDate date;

}
