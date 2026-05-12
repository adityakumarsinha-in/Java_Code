import java.util.*;

public class rank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What's your Score?: ");
        int score = sc.nextInt();

        if(score > 2000){
            System.out.println("You are Legend Player");
        }
        else if(score> 1000){
            System.out.println("You are Pro Player");
        }
        else if(score > 500){
            System.out.println("You're Intermediate Player");
        } 
        else{
            System.out.println("You're Beginner");
        }

    }
}