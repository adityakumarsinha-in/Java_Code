import java.util.*;
public class mark{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        int attend = sc.nextInt();
        
        if(mark >= 40 && attend >= 75){
            System.out.println("Pass");
        }else if(attend < 75){
            System.out.println("Fail due to low attendance");
        } else if(mark< 40){
            System.out.println("Fail");
        }
        if(mark >= 90){
            System.out.println("A");
        }else if(mark >=75 && mark < 89){
            System.out.println("B");
        }else if(mark >=60 && mark < 74){
            System.out.println("C");
        }else if(mark >=40 && mark < 59){
            System.out.println("D");
        }else if(mark < 40){
            System.out.println("F");
        }
    }
}
