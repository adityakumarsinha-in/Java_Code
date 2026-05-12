import java.util.*;

public class electricity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your consumption unit:");
        float unit = sc.nextFloat();

        float total = unit * 5.5f;

        if(total>1000){
            total = total + 200;
            System.out.println("Your Bill: " + total);
        }else{
            total =  (90/100)*100;
            System.out.println("You got discounted!");
            System.out.println("Total Cost to pay after the discount" + total);
        }

    }
}