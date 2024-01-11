/*Write a short Java method, inputAllBaseTypes, that inputs a different value of
each base type from the standard input device and prints it back to the standard
output device.*/

import java.util.Scanner;

public class Main {

    private static void checkAllBaseTypes(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter a byte value: ");
        while (!input.hasNextByte()){
            System.out.println("Please, enter a correct byte value: ");
            input.next();
        }
        System.out.println("you have entered " +input.nextByte() + " /n");


        System.out.println(" Enter a short value: ");
        while(!input.hasNextShort()){
            System.out.println("Please, enter a correct short value: ");
            input.next();
        }
        System.out.println(" you have entered " +input.nextShort()+ " /n");

        System.out.println("Enter a Character: ");
        System.out.println("You have entered " +input.next().chars());

        input.close();

    }
    public static void main(String[] args) {
        checkAllBaseTypes();
    }
}