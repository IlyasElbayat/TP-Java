package TPBibliotheque;

import java.time.LocalDate;
import java.util.Objects;

public class Member {
    private final int id;
    private final String fullName;
    private final Email email;
    private final LocalDate registrationDate;

    public Member(int id, String fullName, Email email, LocalDate registrationDate) {
        if (id <= 0 || fullName == null || fullName.isEmpty() || email == null || registrationDate == null) {
            throw new IllegalArgumentException("Paramètres invalides pour le membre.");
        }
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public Email getEmail() { return email; }
    public LocalDate getRegistrationDate() { return registrationDate; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Member)) return false;
        Member member = (Member) o;
        return id == member.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return fullName + " (" + email + ")";
    }
}
