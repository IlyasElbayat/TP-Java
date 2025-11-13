package TPBibliotheque;
import java.util.Objects;

public final class Isbn {
    private final String value;

    public Isbn(String value) {
        if (value == null || !value.matches("\\d{13}")) {
            throw new IllegalArgumentException("ISBN invalide. Il doit contenir 13 chiffres.");
        }
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Isbn)) return false;
        Isbn isbn = (Isbn) o;
        return Objects.equals(value, isbn.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "ISBN{" + value + '}';
    }
}
