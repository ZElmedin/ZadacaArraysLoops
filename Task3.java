import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Number of elements in your array?");
        int numberOfElements = reader.nextInt();

        int[] intArray = new int[numberOfElements];
        System.out.println("Please enter " + numberOfElements + " elements");
        for (int i = 0; i<intArray.length; i++ ){
            intArray[i] = reader.nextInt();
        }
        System.out.println("Original Array:");

        for(int i=0;i<intArray.length;i++)
            System.out.print(intArray[i] + "  ");

        System.out.println();

        System.out.println("Original Array in Reverse: ");
        for(int i=intArray.length-1;i>=0;i--)
            System.out.print(intArray[i] + "  ");

    }
}

