package TD5_Heritage.formes;


public class TestFormes {
public static void main(String[] args) {
Forme[] formes = new Forme[] {
new Cercle(3.0),
new Rectangle(4.0, 5.0),
new Carre(2.5)
};


for (Forme f : formes) {
System.out.println("Aire: " + f.aire() + " - Perimetre: " + f.perimetre());
}
}
}