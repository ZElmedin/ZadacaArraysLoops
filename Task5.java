import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the lowest number in your range, please: ");
        int lowerNumber = reader.nextInt();

        System.out.println("Enter the largest number in your range, please: ");
        int largerNumber = reader.nextInt();

        System.out.println("Even numbers in your range are: ");
        for (int i = lowerNumber + 1; i < largerNumber; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
