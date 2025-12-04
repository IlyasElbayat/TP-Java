package TD5_Heritage.affichage;

import java.util.ArrayList;
import java.util.List;

import TD5_Heritage.personnes.Personne;

public class Afficheur {
    public static void main(String[] args) {
        List<Affichable> liste = new ArrayList<>();

        liste.add(new Produit("Clavier", 29.99));
        liste.add(new Cours("Programmation Java", 40));
        liste.add(new Personne("Dupont", "Luc", 30));

        for (Affichable a : liste) {
            a.afficher();
        }
    }
}
