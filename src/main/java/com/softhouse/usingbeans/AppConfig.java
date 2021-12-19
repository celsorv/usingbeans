package com.softhouse.usingbeans;

import com.softhouse.usingbeans.model.Author;
import com.softhouse.usingbeans.model.Book;
import com.softhouse.usingbeans.model.BookAuthor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Book getBook() {
        return new Book();
    }

    @Bean
    public BookAuthor getBookAuthor() {
        return new Author();
    }

    // XML equivalence
    // <bean id ="book" class="com.softhouse.usingbeans.Book"/>
}
