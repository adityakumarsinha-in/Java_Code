import java.util.*;
public class LCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        int LCM = LCM(n1, n2);
        System.out.println("LCM of the two number is: " + LCM);

    }

    public static int LCM(int n1, int n2) {
        int i = 1;
        while (true) {
            int factor = n1 * i;
            if (factor % n2 == 0) {
                return factor;
            }
            i++;
        }

    }

}
