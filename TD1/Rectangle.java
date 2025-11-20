
public class Rectangle {
    public double width,height;
}

package TD1.RECTANGLE;
public class Main {
    public static void main(String[] args){
Rectangle R1 = new Rectangle();
Rectangle R2 = new Rectangle();
R1.height = 10;R1.width=20;
R2.height = 10;R2.width=20;
double air1 = R1.width * R1.height;
double air2 = R2.width * R2.height;
System.out.println("Aire du rectangle 1 : " + air1);
System.out.println("Aire du rectangle 2 : " + air2);
}
} {
    
}
