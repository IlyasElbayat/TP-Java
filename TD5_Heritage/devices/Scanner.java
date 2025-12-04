package TD5_Heritage.devices;



public class Scanner extends Appareil {
private int vitesse;


public Scanner(String marque, int vitesse) {
super(marque);
this.vitesse = vitesse;
}


@Override
public void allumer() {
System.out.println("Scanner " + marque + " allum\u00e9 avec vitesse " + vitesse + " ppm.");
}
}