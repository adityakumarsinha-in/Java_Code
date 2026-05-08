import java.util.Scanner;

class relational{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = input.nextInt();

        if(age >=18){
            System.out.println("You're eligible to Drive");
        } else{
            System.out.println("Keep ride the bicycle.");
        }
    }
}