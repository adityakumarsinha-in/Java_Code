
import java.util.*;

public class prodNum {

    public static int proNum(int a, int b) {
        return a * b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The Product of two num is: " + proNum(a, b));
    }

}
