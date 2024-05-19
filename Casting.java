// an application that separately prompts for and obtains two non-zero integer values. Calculate and display the two decimal quotients, i.e., number1 / number2 and number2 / number1.
//
import java.util.Scanner;
class Casting {
    public static void main(String[] args) {

        int a,b;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first non - zero integer: "); //prompting 1st input from the user
        a = scan.nextInt(); //obtaining 1st input from user


        System.out.println("Enter second non - zero intege: ");//prompting 2nd input from the user
        b = scan.nextInt(); //obtaining 2nd input from user

        //casting from integer to double before diving
        double result1 = (double) a/ b;
        double result2 = (double)b/ a;


        System.out.println("1st result: "  +result1); //1st output
        System.out.println("2nd result:" +result2);//2nd output
    }
}