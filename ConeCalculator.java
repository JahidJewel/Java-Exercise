
/*
 Student Name: Jahidul Islam
 * TRU ID: T00752321
 * File Name: ConeCalculator

Write an application that reads the radius and height of a cone then calculates and displays the volume and surface area. Use the following formulas, in which r and h represent the cone’s radius and height. Print the output to four decimal places.
Volume = 1/3 π r2 h  Surface Area = π r (r + s) where s is the ‘slant height’ which is r2+h2−−−−−−√*/



import java.util.Scanner;

public class ConeCalculator {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read radius
        System.out.print("Enter the length of the radius: ");
        double radius = scanner.nextDouble();

        // Prompt for and read height
        System.out.print("Enter the length of the height: ");
        double height = scanner.nextDouble();

        // Calculate slant height
        double s = Math.sqrt(radius * radius + height * height);

        // Calculate volume, surface area
        double volume = (1.0/3.0) * Math.PI * radius*radius *height;
        double surface_area = Math.PI *radius * (radius + s);


        // Display results
        System.out.println("Voulme :" +volume);
        System.out.println("Surface Area: " + surface_area);



    }
}
