package TD5_Heritage.affichage;


public class Produit implements Affichable {
private String nom;
private double prix;


public Produit(String nom, double prix) {
this.nom = nom;
this.prix = prix;
}


@Override
public void afficher() {
System.out.println("Produit: " + nom + " - Prix: " + prix);
}
}