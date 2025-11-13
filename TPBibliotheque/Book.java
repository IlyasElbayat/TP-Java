package TPBibliotheque;

import java.util.Objects;

public class Book {
    private final Isbn isbn;
    private final String title;
    private final String author;
    private final int publicationYear;

    public Book(Isbn isbn, String title, String author, int publicationYear) {
        if (isbn == null || title == null || title.isEmpty() || author == null || author.isEmpty() || publicationYear <= 0) {
            throw new IllegalArgumentException("Paramètres invalides pour le livre.");
        }
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public Isbn getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        return title + " (" + author + ", " + publicationYear + ")";
    }
}
