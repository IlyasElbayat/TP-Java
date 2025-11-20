public class IdGenerator {
    private static long next = 1;

    public static synchronized long nextId() {
        return next++;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(IdGenerator.nextId()); 
        System.out.println(IdGenerator.nextId());
        System.out.println(IdGenerator.nextId());
    }
}
