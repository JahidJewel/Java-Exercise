/*
* Student Name: Jahidul Islam
 * TRU ID: T00752321
 * File Name: EvenDigitCounter
 *
 *Design and implement an application that repeatedly reads some text from the user, then determines and displays how many of each of the even digits (i.e., 0, 2, 4, 6, and 8) appear in the entire text. Have a separate counter for each digit. Also count and print the number of all other characters. The logic must include a switch-case structure to determine which counter to increment. After the results for an input are displayed, prompt the user if they want to do another input.

Hint: Use the charAt method of the String class to examine each character of the input.

Testing: Build a test plan separately so you can predict and show that your program is working correctly. You need to determine a selection of inputs that demonstrates that each counter is functioning independently of the others. For example: a string of numbers with only the even digit “0” such as “007” or a string of characters with no digits at all such as “Droids!@#$”.
* */


import java.util.Scanner;

public class EvenDigitCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        while (continueInput) {
            System.out.println("Enter some text:");
            String input = scanner.nextLine();

            int count0 = 0, count2 = 0, count4 = 0, count6 = 0, count8 = 0, otherCount = 0; // a separate counter for each digit

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i); // charAt method of the String class to examine each character of the input
                switch (ch) { // switch-case structure to determine which counter to increment
                    case '0':
                        count0++;
                        break;
                    case '2':
                        count2++;
                        break;
                    case '4':
                        count4++;
                        break;
                    case '6':
                        count6++;
                        break;
                    case '8':
                        count8++;
                        break;
                    default:
                        otherCount++;
                        break;
                }
            }

            System.out.println("Count of 0: " + count0);
            System.out.println("Count of 2: " + count2);
            System.out.println("Count of 4: " + count4);
            System.out.println("Count of 6: " + count6);
            System.out.println("Count of 8: " + count8);
            System.out.println("Count of other characters: " + otherCount);

            System.out.println("Do you want to enter another text? (yes/no)"); // prompting the user if they want to do another input.
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                continueInput = false;
            }
        }


    }
}
