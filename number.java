import java.util.Scanner;

public class number{    
public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter your Number:");
        int num = number.nextInt();

        if (num == 0) {
            System.out.println("The number is 0.");
        } else if (num > 0){
            System.out.println("Number is positive.");
        }
        else{
            System.out.println("You number is Negative.");
        }
    }
}
