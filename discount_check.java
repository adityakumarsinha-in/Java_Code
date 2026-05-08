
import java.util.Scanner;

public class discount_check {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Discount portal!");
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Are you Female? (True/False)");
        boolean isFemale = input.nextBoolean();

        if(age < 5){
            System.out.println("Elgible for 75 Discount");
        }else if(isFemale){
            System.out.println("You are eligble for maximum discount.");
        } else if(age > 60 && !isFemale){
            System.out.println("You are elgible for the 25% of Discount");
        }else{
            System.out.println("You got no discount.");
        }
    }
}
