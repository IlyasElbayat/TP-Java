package TD5_Heritage.banque;


public abstract class Compte {
protected String numero;
protected double solde;


public Compte(String numero, double solde) {
this.numero = numero;
this.solde = solde;
}


public void deposer(double montant) {
if (montant > 0) {
solde += montant;
}
}


public abstract boolean retirer(double montant);


public void afficherSolde() {
System.out.println("Compte " + numero + " solde: " + solde);
}
}