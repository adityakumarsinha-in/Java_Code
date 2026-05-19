import java.util.*;
class funString {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String nm = sc.nextLine();
        System.out.println(input(nm));
    }
    static String input(String name){
        return name + " is a super hero.";
    }
}
