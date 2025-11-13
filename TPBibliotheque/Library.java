package TPBibliotheque;

import java.util.*;

public class Library {
    private final List<Book> books = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();
    private final List<Loan> loans = new ArrayList<>();

    public void addBook(Book book) {
        if (book != null && !books.contains(book)) {
            books.add(book);
        }
    }

    public void registerMember(Member member) {
        if (member != null && !members.contains(member)) {
            members.add(member);
        }
    }

    public void loanBook(Book book, Member member, Loan loan) {
        if (book != null && member != null && loan != null) {
            loans.add(loan);
        }
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public List<Member> getMembers() {
        return Collections.unmodifiableList(members);
    }

    public List<Loan> getLoans() {
        return Collections.unmodifiableList(loans);
    }

    public List<Loan> getCurrentLoans() {
        List<Loan> activeLoans = new ArrayList<>();
        for (Loan l : loans) {
            if (l.getStatus().isActive()) {
                activeLoans.add(l);
            }
        }
        return Collections.unmodifiableList(activeLoans);
    }
}
