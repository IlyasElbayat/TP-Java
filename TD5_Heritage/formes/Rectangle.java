package TD5_Heritage.formes;


public class Rectangle extends Forme {
protected double largeur;
protected double hauteur;


public Rectangle(double largeur, double hauteur) {
this.largeur = largeur;
this.hauteur = hauteur;
}


@Override
public double aire() {
return largeur * hauteur;
}


@Override
public double perimetre() {
return 2 * (largeur + hauteur);
}
}