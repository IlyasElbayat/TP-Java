package TD5_Heritage.personnes;

import TD5_Heritage.affichage.Affichable;

public class Personne implements Affichable {

    protected String nom;
    protected String prenom;
    protected int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public void sePresenter() {
System.out.println("Je m\'appelle " + prenom + " " + nom + ", j\'ai " + age + " ans.");
}

    @Override
    public void afficher() {
        System.out.println("Personne : " + nom + " " + prenom + " (" + age + " ans)");
    }
}
