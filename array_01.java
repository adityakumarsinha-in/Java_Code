public class array_01 {
    
    public static void main(String[] args) {
        float [] marks = {45.6f, 67.3f, 84.4f, 45.3f};
        float sum = 0;
        for(float elements:marks){
            sum = sum + elements;

        }
        System.out.println("The sum of the numnber is " + sum);
    }
}
