package TD5_Heritage.personnes;

public class Etudiant extends Personne {
private String filiere;


public Etudiant(String nom, String prenom, int age, String filiere) {
super(nom, prenom, age);
this.filiere = filiere;
}


@Override
public void sePresenter() {
System.out.println("Je m\'appelle " + prenom + " " + nom + ", j\'ai " + age + " ans. Fili\u00e8re: " + filiere + ".");
}


public String getFiliere() {
return filiere;
}
}