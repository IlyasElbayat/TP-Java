package TD5_Heritage.personnes;


public class Enseignant extends Personne {
private String specialite;


public Enseignant(String nom, String prenom, int age, String specialite) {
super(nom, prenom, age);
this.specialite = specialite;
}


@Override
public void sePresenter() {
System.out.println("Je m\'appelle " + prenom + " " + nom + ", j\'ai " + age + " ans. Sp\u00e9cialit\u00e9: " + specialite + ".");
}


public String getSpecialite() {
return specialite;
}
}