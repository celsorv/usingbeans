package com.softhouse.usingbeans;

import com.softhouse.usingbeans.model.Author;
import com.softhouse.usingbeans.model.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String[] args) {

        AbstractApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        /*
         * In the AppConfig class this is enabled with @Bean
         */

        Book book = factory.getBean(Book.class);
        book.setName("A Brief History of Time");
        book.setCode("D34F2");

        Author author = factory.getBean(Author.class);
        author.setName("Stephen Hawking");

        System.out.println("-".repeat(40));
        book.show();
        System.out.println("-".repeat(40));

        factory.close();

    }

}
