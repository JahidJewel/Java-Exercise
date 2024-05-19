/* Student Name: Jahidul Islam
 * TRU ID: T00752321
 * File Name: TrigonometryCalculation

The given the values for the adjacent and opposite side, the hypotenuse can be calculated as Hypotenuse=(adjacent)2+(opposite)2−−−−−−−−−−−−−−−−−−−−−√

Write an application that reads the values for the adjacent and opposite lengths as decimal values, then determines and displays the values for the sin, cos, and tan. This should prompt for and read each of the two values individually.
*   */


import java.util.Scanner;

public class Triangle {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        double hypotenuse, adjacent, opposite;
        double sin, cos, tan;

        System.out.println("Enter your adjacent value: "); //prompting the user to enter adjacent value
        adjacent = scan.nextDouble(); //obtaining adjacent value

        System.out.println("Enter your opposite value: "); ////prompting the user to enter opposite value
        opposite = scan.nextDouble(); ////obtaining opposite value

        hypotenuse = Math.sqrt(adjacent*adjacent + opposite*opposite); // Trigonometry formula for hypotenues

        //Trigonometry formula for Sine, Cosine and Tangent
        sin = opposite/hypotenuse;
        cos = adjacent/hypotenuse;
        tan = opposite/ adjacent;


        //Printing values for Sine, Cosine and Tangent
        System.out.println("sin = " +sin);
        System.out.println("cos = " +cos);
        System.out.println("tan = " +tan);


    }
}
