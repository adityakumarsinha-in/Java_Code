import java.util.*;
public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num  = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<num; i=i+1){
            sum = sum + i;
        }
        System.out.println("Sum of natural num is "+ sum);
    }
}