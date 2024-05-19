import java.util.Scanner;
public class MilesToKilometers
{
    //-----------------------------------------------------------------
// Converts a distance in miles into kilometers based on values entered by the
// user.
// value using the formula, miles = 1.60935 kilometers
//-----------------------------------------------------------------
    public static void main(String[] args)
    {
        double miles, kms;
        final double CONVERSION_FACTOR = 1.60935;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of miles: "); //asking for/ prompting  input from user
        miles = scan.nextDouble(); // takes/obtains input from user
        kms = miles * CONVERSION_FACTOR ; //converts the miles into kilometers
        System.out.println("Distance of miles in kilometers is " + kms); //printing out the final converted value
    }
}