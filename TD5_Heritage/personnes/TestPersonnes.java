package TD5_Heritage.personnes;


import java.util.ArrayList;
import java.util.List;


public class TestPersonnes {
public static void main(String[] args) {
List<Personne> personnes = new ArrayList<>();
personnes.add(new Personne("Dupont", "Jean", 40));
personnes.add(new Etudiant("Martin", "Alice", 20, "Informatique"));
personnes.add(new Enseignant("Bernard", "Paul", 50, "Math\u00e9matiques"));


for (Personne p : personnes) {
p.sePresenter();
}
}
}