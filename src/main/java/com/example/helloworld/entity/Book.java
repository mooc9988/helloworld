package com.example.helloworld.entity;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class Book {
    private String name;
    private float price;
    private String author;
    private String publisher;
    private LocalDateTime publishDate;

    public Book(String name, float price, String author, String publisher, LocalDateTime publishDate) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.publisher = publisher;
        this.publishDate = publishDate;
    }

    public boolean isValid() {
        return name != null && price > 0 && author != null && publisher != null && publishDate != null;
    }
}
