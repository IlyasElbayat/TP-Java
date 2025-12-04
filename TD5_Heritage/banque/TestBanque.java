package TD5_Heritage.banque;


public class TestBanque {
public static void main(String[] args) {
Compte[] comptes = new Compte[] {
new CompteCourant("CC-001", 100.0, 200.0),
new CompteEpargne("CE-001", 500.0, 0.02)
};


comptes[0].deposer(50);
comptes[0].retirer(300);
comptes[0].afficherSolde();


comptes[1].retirer(100);
comptes[1].afficherSolde();


if (comptes[1] instanceof CompteEpargne) {
((CompteEpargne) comptes[1]).appliquerInterets();
}
comptes[1].afficherSolde();
}
}