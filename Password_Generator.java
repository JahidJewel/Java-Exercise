/** Student Name: Jahidul Islam
 * TRU ID: T00752321
 * File Name: Password_Generator
 *  */

/**Write an application that prompts for and obtains a person’s first and last name (separately),
 then composes and displays a new password for a computer account.
 The password is to be a string composed of the first character of the person’s first name, followed by two random digits in the range 0 to 9,
 followed by the first letter of the person’s last name, followed by three more random digits in the range 0 to 9 */

import java.util.Random;
import java.util.Scanner;


public class Password_Generator {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        //Generating random numbers

        int randomDigit1 = random.nextInt(9);
        String str1 = Integer.toString(randomDigit1); //converting Integer to String

        int randomDigit2 = random.nextInt(9);
        String str2 = Integer.toString(randomDigit2); //converting Integer to String

        int randomDigit3 = random.nextInt(9);
        String str3 = Integer.toString(randomDigit3); //converting Integer to String

        int randomDigit4 = random.nextInt(9);
        String str4 = Integer.toString(randomDigit4); //converting Integer to String

        int randomDigit5 = random.nextInt(9);
        String str5 = Integer.toString(randomDigit5); //converting Integer to String


        String first_name;
        String last_name;
        String password;

        System.out.println("Enter your First Name: "); //prompting the user for first name
        first_name = scan.nextLine();  //obtaining the user for first name

        System.out.println("Enter your Last Name: "); //prompting the user for last name
        last_name = scan.nextLine(); //obtaining the user for first name

        //New generated password
        password = first_name.charAt(0) + str1 + str2 + last_name.charAt(0) + str3 + str4 + str5;

        System.out.println("Your new generated password is : " +password);



    }



}
