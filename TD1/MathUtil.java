public final class MathUtil {

    private MathUtil() {
    }

    public static int clamp(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println(MathUtil.clamp(5, 0, 10)); 
        System.out.println(MathUtil.clamp(-3, 0, 10)); 
        System.out.println(MathUtil.clamp(20, 0, 10));  
    }
}
