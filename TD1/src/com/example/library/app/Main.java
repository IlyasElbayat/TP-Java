package com.example.library.app;

import com.example.library.model.Book;
import com.example.library.model.Member;
import com.example.library.service.LibraryService;

public class Main {
    public static void main(String[] args) {

        LibraryService library = new LibraryService();

        // Ajout de livres
        library.addBook(new Book("ISBN001", "Java Basics", "Alice"));
        library.addBook(new Book("ISBN002", "Advanced Java", "Bob"));

        // Ajout de membres
        library.addMember(new Member("M001", "Charlie", "charlie@mail.com"));
        library.addMember(new Member("M002", "David", "david@mail.com"));

        System.out.println("Livres : " + library.getBooks());
        System.out.println("Membres : " + library.getMembers());

        System.out.println("Livres de Bob : " + library.findBooksByAuthor("Bob"));
    }
}
