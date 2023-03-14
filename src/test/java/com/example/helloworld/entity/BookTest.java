package com.example.helloworld.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testIsValid() {
        final Book book = new Book("Java", 100, "James Gosling", "Oracle", null);
        assertFalse(book.isValid());
    }
}