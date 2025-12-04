package TD5_Heritage.devices;



public class Imprimante extends Appareil {
private int resolution;


public Imprimante(String marque, int resolution) {
super(marque);
this.resolution = resolution;
}


@Override
public void allumer() {
System.out.println("Imprimante " + marque + " allum\u00e9e avec r\u00e9solution " + resolution + " DPI.");
}
}