import java.util.Scanner;

public class TimeConverter {

    //-----------------------------------------------------------------
    //  an application that prompts for and obtains a value representing a whole number of seconds, then displays the equivalent amount of time as a combination of hours, minutes, and seconds
    //-----------------------------------------------------------------
    public static void main (String[] args)
    {
        int TotalSeconds;
        int hours;
        int minutes;
        int seconds;

        Scanner scan = new Scanner(System.in);

        System.out.print ("Please, enter the total number of seconds:"); //prompting for the input from user
        TotalSeconds = scan.nextInt(); //obtaining the input from user

        //converting the total seconds as input obtained from user into hours, minutes and seconds
        hours = (TotalSeconds / 3600);
        minutes = (TotalSeconds / 60) - (hours * 60);
        seconds = (TotalSeconds - (minutes * 60)) - (hours * 3600);

        System.out.println ("Converted hours: " + hours);
        System.out.println ("Converted minutes: " + minutes);
        System.out.println ("Converted seconds: " + seconds);
    }
}
