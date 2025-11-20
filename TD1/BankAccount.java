public class BankAccount {
    private String iban;
    private long balanceInCents;

    public BankAccount(String iban, long balanceInCents) {
        if (iban == null || iban.isBlank())
            throw new IllegalArgumentException("IBAN invalide");

        if (balanceInCents < 0)
            throw new IllegalArgumentException("Solde initial négatif");

        this.iban = iban;
        this.balanceInCents = balanceInCents;
    }

    public void deposit(long amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Montant invalide");
        this.balanceInCents += amount;
    }

    public void withdraw(long amount) {
        if (amount <= 0 || amount > balanceInCents)
            throw new IllegalArgumentException("Retrait impossible");
        this.balanceInCents -= amount;
    }

    public long getBalanceInCents() {
        return balanceInCents;
    }

    public String getFormattedBalance() {
        return (balanceInCents / 100.0) + " EUR";
    }
}
