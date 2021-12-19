package com.softhouse.usingbeans.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Author implements BookAuthor {

    private String name;

    @Override
    public void showAuthor() {
        System.out.println(this.name);
    }

}
