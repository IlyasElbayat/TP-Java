package TD5_Heritage.banque;


public class CompteEpargne extends Compte {
private double tauxInteret;


public CompteEpargne(String numero, double solde, double tauxInteret) {
super(numero, solde);
this.tauxInteret = tauxInteret;
}


@Override
public boolean retirer(double montant) {
if (montant <= 0) return false;
if (solde - montant >= 0) {
solde -= montant;
return true;
}
return false;
}


public void appliquerInterets() {
solde += solde * tauxInteret;
}
}