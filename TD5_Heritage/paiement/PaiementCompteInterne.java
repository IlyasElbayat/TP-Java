package TD5_Heritage.paiement;


public class PaiementCompteInterne implements MoyenPaiement {
private String utilisateur;


public PaiementCompteInterne(String utilisateur) {
this.utilisateur = utilisateur;
}


@Override
public void payer(double montant) {
System.out.println("Paiement via CompteInterne (" + utilisateur + ") de " + montant + " EUR");
}
}