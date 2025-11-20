package com.example.library.model;

public final class Book {
    private final String isbn;
    private final String title;
    private final String author;

    public Book(String isbn, String title, String author) {
        if (isbn == null || isbn.isBlank())
            throw new IllegalArgumentException("ISBN invalide");
        if (title == null || title.isBlank())
            throw new IllegalArgumentException("Titre invalide");
        if (author == null || author.isBlank())
            throw new IllegalArgumentException("Auteur invalide");

        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    @Override
    public String toString() {
        return "Book{" + "isbn='" + isbn + '\'' + ", title='" + title + '\'' + ", author='" + author + '\'' + '}';
    }
}
