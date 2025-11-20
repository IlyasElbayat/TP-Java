
public class Temperature {
    private double value;

    public Temperature(double value) {
        if (value < -273.15)
            throw new IllegalArgumentException("Valeur température invalide");
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < -273.15)
            throw new IllegalArgumentException("Valeur température invalide");
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {

        Temperature t1 = new Temperature(25);
        System.out.println("Température : " + t1.getValue());

        try {
            Temperature t2 = new Temperature(-300);
        } catch (IllegalArgumentException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
