import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many numbers would you like?");
        int numbersInArray = reader.nextInt();
        int[] myArray = new int[numbersInArray];

        for (int i = 1; i <= myArray.length; i++){
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}