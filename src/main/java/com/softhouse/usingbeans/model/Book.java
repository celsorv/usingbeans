package com.softhouse.usingbeans.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter @Setter
public class Book {

    private String code;
    private String name;

    // Inversion of control (IoC) using dependency injection (DI)
    @Autowired
    private BookAuthor bookAuthor;

    public void show() {
        System.out.println(this.name + " - " + this.code);
        bookAuthor.showAuthor();
    }

}
