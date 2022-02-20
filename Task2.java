public class Task2 {
    public static void main(String[] args) {
         String[] ordinalNumbersArray = {"first", "second", "third", "fourth", "fifth",
                 "sixth", "seventh", "eighth","ninth", "tenth",
                 "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",};
        int[] myNumberArray = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

            for (int i = 0; i < myNumberArray.length - 5; i++)
                System.out.println(" The " + ordinalNumbersArray[i] + " number in array: " + myNumberArray[i]);
        }
    }