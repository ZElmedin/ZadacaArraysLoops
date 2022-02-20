import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many elements would you like?");
        int arrayLength = reader.nextInt();
        int[] chosenArrayNumber = new int[arrayLength];

        int numberIterator = 0;
        for (int i = 0; i < chosenArrayNumber.length; i++) {
            System.out.println("Please enter element number " + ++numberIterator);
            chosenArrayNumber[i] = reader.nextInt();
        }
        int numberIterator2 = 0;
        for (int j=0; j<chosenArrayNumber.length; j++) {
            System.out.println("The number in position " + (++numberIterator2) + " is: " + chosenArrayNumber[j]);
            if ((chosenArrayNumber[j]>10) && (chosenArrayNumber[j]%2==0)) {
                System.out.println("This particular number is greater than 10, and it is even.");
            }
        }

    }
}