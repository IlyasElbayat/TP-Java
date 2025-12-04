package TD5_Heritage.affichage;


public class Cours implements Affichable {
private String titre;
private int volumeHoraire;


public Cours(String titre, int volumeHoraire) {
this.titre = titre;
this.volumeHoraire = volumeHoraire;
}


@Override
public void afficher() {
System.out.println("Cours: " + titre + " - Volume: " + volumeHoraire + "h");
}
}