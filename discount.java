//Write a program that u have bought 4 things from any shop if the total price of these four items if greater than 1999 then u r elegible to get the discount.(take the price of all four items by user in put)
import java.util.*;
    public class discount{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Price of 1st Product");
    int p1 = sc.nextInt();
    System.out.println("Enter the 2nd Price");
    int p2 = sc.nextInt();
    System.out.println("Enter the 3rd Price");
    int p3 = sc.nextInt();
    System.out.println("Enter 4th price");
    int p4 = sc.nextInt();

    int total  = p1+p2+p3+p4;
    if(total>1999){
        System.out.println("You're eligible for the discount");
    }else{
        System.out.println("No Discount");
    }
}

}
