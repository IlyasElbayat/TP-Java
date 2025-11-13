import java.util.Scanner;
public class Primalite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean p = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) p = false;
        System.out.println(p ? "Premier" : "Non premier");
        sc.close();
    }
}
