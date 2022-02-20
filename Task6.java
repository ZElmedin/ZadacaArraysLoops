import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Number of elements in the first array, please: ");
        int numberOfElementsArray1 = reader.nextInt();
        int[] a = new int[numberOfElementsArray1];
        System.out.println("Please enter " + numberOfElementsArray1 + " numbers");
        for (int i=0; i<a.length; i++) {
            a[i] = reader.nextInt();
        }

        System.out.println("Number of elements in the second array, please: ");
        int numberOfElementsArray2 = reader.nextInt();
        int[] b = new int[numberOfElementsArray2];
        System.out.println("Please enter " + numberOfElementsArray2 + " numbers");
        for (int i=0; i<b.length; i++) {
            b[i] = reader.nextInt();
        }
        System.out.println("Your numbers combined are: ");

    }
}
