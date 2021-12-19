# Introduction to Spring Boot

### Below, steps performed.

### first steps:

- Initial project created with Spring Initializr
- Project open on IntelliJ IDEA
- BookAuthor interface created
- Book class created
- Author class _(implements Book Author interface)_ created
- App class created
- AppConfig class created

```
public class Book {

    private String code;
    private String name;

    // Inversion of control (IoC) using dependency injection (DI)
    @Autowired
    private BookAuthor bookAuthor;
```

```
    @Bean
    public Book getBook() {
        return new Book();
    }

    @Bean
    public BookAuthor getBookAuthor() {
        return new Author();
    }
```

#### It already works!

```
[...]
Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
Creating shared instance of singleton bean 'appConfig'
Creating shared instance of singleton bean 'getBook'
A Brief History of Time - D34F2
```
