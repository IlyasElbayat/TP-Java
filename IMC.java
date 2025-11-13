import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble(), t = sc.nextDouble();
        double imc = p / (t * t);
        System.out.println(imc);
        sc.close();
    }
}
