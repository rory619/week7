import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter a number between 0 - 9");
        Scanner myscan = new Scanner(System.in);
        int x = 0;
        while (x == 0) {

            try {
                //read user input as a string
                String input = myscan.nextLine();

                //Pass the input to an integer
                int myNum = Integer.parseInt(input);

                if (myNum > 0 && myNum <= 9) {
                    System.out.println("You entered" + myNum);
                    x++;
                } else {
                    System.out.println("Not a valid number");

                }
            } catch (NumberFormatException e) {
                System.out.println("Enter a numeric value");

            }
        }
    }
}
