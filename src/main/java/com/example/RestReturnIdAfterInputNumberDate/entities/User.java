package com.example.RestReturnIdAfterInputNumberDate.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tblUser")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Column(name = "userNumber")
    private int the_number;

    @NotBlank
    @Column(name = "userText")
    private String text;

    @NotBlank
    @Column(name = "userDate")
    private LocalDate date;

}
