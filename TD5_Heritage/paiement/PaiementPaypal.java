package TD5_Heritage.paiement;


public class PaiementPaypal implements MoyenPaiement {
private String compte;


public PaiementPaypal(String compte) {
this.compte = compte;
}


@Override
public void payer(double montant) {
System.out.println("Paiement via PayPal (" + compte + ") de " + montant + " EUR");
}
}