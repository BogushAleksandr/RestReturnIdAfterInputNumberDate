package com.example.RestReturnIdAfterInputNumberDate.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "tblUser")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Column(name = "userNumber")
    private int userNumber;

    @NotBlank
    @Column(name = "userText")
    private String text;

    @NotBlank
    @Column(name = "userDate")
    private LocalDate date;

    /*@Override
    public String toString() {
        return "id = " + id + ", text = " + text + "date = " + date;
    }*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int the_number) {
        this.userNumber = the_number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
