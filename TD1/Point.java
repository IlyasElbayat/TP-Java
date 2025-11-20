
public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public void afficher() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
public class Main {
    public static void main(String[] args) {

        Point p = new Point();
        p.translate(5, -3);
        p.afficher();
    }
}

