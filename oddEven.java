
import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Your number is Even.");
        } else {
            System.out.println("You're number is Odd.");
        }
    }
}

