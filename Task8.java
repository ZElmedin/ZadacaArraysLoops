import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String[] threeWords = new String[3];

        System.out.println("Please enter a string of 3 words");

        for (int i = 0; i < threeWords.length; i++) {
            threeWords[i] = reader.nextLine();
        }
        System.out.println("Elements with vowels: ");
        for (int i = 0; i < threeWords.length; i++) {
            if (threeWords[i].toLowerCase().contains("a") || threeWords[i].toLowerCase().contains("e") ||
                    threeWords[i].toLowerCase().contains("i") || threeWords[i].toLowerCase().contains("o") || threeWords[i].toLowerCase().contains("u")) {
                    System.out.print(threeWords[i] + " ");
                }
            }
        }
    }
