package TD5_Heritage.paiement;


public class PaiementCarteBancaire implements MoyenPaiement {
private String numeroCarte;


public PaiementCarteBancaire(String numeroCarte) {
this.numeroCarte = numeroCarte;
}


@Override
public void payer(double montant) {
System.out.println("Paiement par carte (" + numeroCarte + ") de " + montant + " EUR");
}
}