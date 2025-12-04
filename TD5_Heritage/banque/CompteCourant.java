package TD5_Heritage.banque;

public class CompteCourant extends Compte {
private double decouvertAutorise;


public CompteCourant(String numero, double solde, double decouvertAutorise) {
super(numero, solde);
this.decouvertAutorise = decouvertAutorise;
}


@Override
public boolean retirer(double montant) {
if (montant <= 0) return false;
if (solde - montant >= -decouvertAutorise) {
solde -= montant;
return true;
}
return false;
}
}