package TPBibliotheque;

import java.time.LocalDate;
import java.util.Objects;

public class Loan {
    private final Book book;
    private final Member member;
    private final LocalDate loanDate;
    private final LocalDate dueDate;
    private LoanStatus status;

    public Loan(Book book, Member member, LocalDate loanDate, LocalDate dueDate) {
        if (book == null || member == null || loanDate == null || dueDate == null || dueDate.isBefore(loanDate)) {
            throw new IllegalArgumentException("Dates ou paramètres invalides pour l'emprunt.");
        }
        this.book = book;
        this.member = member;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.status = LoanStatus.ONGOING;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void updateStatus() {
        if (status == LoanStatus.ONGOING && LocalDate.now().isAfter(dueDate)) {
            status = LoanStatus.LATE;
        }
    }

    public boolean returnBook() {
        if (status.canTransitionTo(LoanStatus.RETURNED)) {
            status = LoanStatus.RETURNED;
            return true;
        }
        return false;
    }

    public LoanStatus getStatus() {
        updateStatus();
        return status;
    }

    @Override
    public String toString() {
        return "Emprunt : " + member.getFullName() +
                " → " + book.getTitle() +
                " (" + status + ", du " + loanDate + " au " + dueDate + ")";
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, member, loanDate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Loan)) return false;
        Loan loan = (Loan) o;
        return book.equals(loan.book) &&
               member.equals(loan.member) &&
               loanDate.equals(loan.loanDate);
    }
}
