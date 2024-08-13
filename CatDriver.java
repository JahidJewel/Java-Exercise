
    import java.util.Scanner;

    public class CatDriver {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Cat cat = new Cat();
            String command;

            System.out.println("Cat Climbing Simulator");
            System.out.println("----------------------");
            System.out.println("Commands:");
            System.out.println("O - Output current position and direction");
            System.out.println("C - Climb");
            System.out.println("R - Reverse direction");
            System.out.println("E - Exit");

            do {
                System.out.print("Enter command: ");
                command = scanner.nextLine().toUpperCase();

                switch (command) {
                    case "O":
                        System.out.println(cat);
                        break;
                    case "C":
                        cat.climb();
                        break;
                    case "R":
                        cat.reverse();
                        break;
                    case "E":
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid command.");
                        break;
                }
            } while (!command.equals("E"));

            scanner.close();
        }
    }

    /*create screenshot exhibits for a number of scenarios (e.g. output original state, climb a few times, output, climb a few more times, output, reverse, output, climb, output, reverse, output, etc.).
    *
    * */




