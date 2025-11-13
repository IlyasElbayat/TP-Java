import java.util.Scanner;
public class Aire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble(), L = sc.nextDouble();
        System.out.println(l * L);
        sc.close();
    }
}
