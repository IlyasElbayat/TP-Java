import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        if (a == b && b == c) System.out.println("Équilatéral");
        else if (a == b || b == c || a == c) System.out.println("Isocèle");
        else System.out.println("Scalène");
        sc.close();
    }
}
