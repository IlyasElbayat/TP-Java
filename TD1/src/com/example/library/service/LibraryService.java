package com.example.library.service;

import com.example.library.model.Book;
import com.example.library.model.Member;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LibraryService {
    private final List<Book> books;
    private final List<Member> members;

    public LibraryService() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) { books.add(book); }
    public void addMember(Member member) { members.add(member); }

    public List<Book> getBooks() { return List.copyOf(books); }
    public List<Member> getMembers() { return List.copyOf(members); }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book b : books) {
            if (b.getAuthor().equalsIgnoreCase(author))
                result.add(b);
        }
        return result;
    }
}
