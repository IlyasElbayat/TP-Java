
public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        if (width < 0)
            throw new IllegalArgumentException("La largeur ne peut pas être négative");
        this.width = width;
    }

    public void setHeight(double height) {
        if (height < 0)
            throw new IllegalArgumentException("La hauteur ne peut pas être négative");
        this.height = height;
    }

    public double area() {
        return width * height;
    }
}
public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setWidth(10);
        r.setHeight(5);

        System.out.println("Aire du rectangle : " + r.area());
    }
}
