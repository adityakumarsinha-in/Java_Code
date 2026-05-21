//Write a program to calculate the average marks from an array containing marks of all students in physics using for each loop.
class array_03{
public static void main(String[] args){
    float [] marks =  {33.4f, 33.5f, 32.5f,34.3f, 29.3f};
    float sum = 0;
    for(float elements:marks){
        sum = sum + elements;
    }
    System.out.println("The average of the marks is "+ sum/marks.length);
}
}
