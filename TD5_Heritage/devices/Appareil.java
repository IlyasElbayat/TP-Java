package TD5_Heritage.devices;


public abstract class Appareil {
protected String marque;


public Appareil(String marque) {
this.marque = marque;
}


public abstract void allumer();


public void afficherInfos() {
System.out.println("Marque: " + marque);
}
}