//Write program to find out whether a given integer is present in an array or not?

public class array_02 {

    public static void main(String[] args) {
        float[] marks = {44.5f, 33.5f, 4.4f, 2.4f, 5.6f, 3.56f};
        float num = 44.5f;
        boolean isAnArray = false;
        for (float elements : marks) {
            if (num == elements) {
                isAnArray = true;
                break;
            }
        }
        System.out.println("You're searching f0r " + num );
        if (isAnArray) {
            System.out.println("The value is presented in the array.");
        } else {
            System.out.println("The value are not presented!");
        }
    }
}
