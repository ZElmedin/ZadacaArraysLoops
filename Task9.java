import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        System.out.println("How many numbers would you like in array 1? ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int myArray[] = new int [size];
        int sum = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int i=0; i<size; i++){
            myArray[i] = s.nextInt();
            sum = sum + myArray[i];
        }
        System.out.println("Elements of the array 1 are: "+ Arrays.toString(myArray));
        System.out.println("Sum of the elements of array 1 :"+sum);

        System.out.println("How many numbers would you like in array 2? ");
        Scanner s2 = new Scanner(System.in);
        int size2 = s2.nextInt();
        int myArray2[] = new int [size2];
        int sum2 = 0;
        System.out.println("Enter the elements of the array one by one ");

        for(int j=0; j<size; j++) {
            myArray2[j] = s.nextInt();
            sum2 = sum2 + myArray2[j];
        }
            System.out.println("Elements of the array 2 are: "+ Arrays.toString(myArray2));
            System.out.println("Sum of the elements of array 2 :"+sum2);

        System.out.println("The total sum of the two arrays is " + (sum+sum2));
        }
    }

