import java.util.*;

class multiplication_table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int num = sc.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num){
        int i =1;
        while(i<=10){
            System.out.println(num + "X"+ i + "=" + (num * i));
            i++;
        }

    }

}