package TPBibliotheque;

public enum LoanStatus {
    ONGOING, RETURNED, LATE;

    public boolean isActive() {
        return this == ONGOING || this == LATE;
    }

    public boolean canTransitionTo(LoanStatus next) {
        if (this == RETURNED) return false;
        if (this == ONGOING && next == LATE) return true;
        if (this == ONGOING && next == RETURNED) return true;
        if (this == LATE && next == RETURNED) return true;
        return false;
    }
}
