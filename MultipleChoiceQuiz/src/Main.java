import java.util.Scanner;

/*  Write a multiple choice quiz program which will display the questions to user and take an input as an answer from the user and
    let the user know their total score at the end.
* */

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] answers = {"a", "c", "b"};
        String[] responses = {"", "", ""};

        System.out.println("What's the capital of Canada? ");
        System.out.println("a) Ottawa");
        System.out.println("b) Toronto");
        System.out.println("c) Vancouver");

        System.out.println("What's the largest animal on the planet? ");
        System.out.println("a) Elephant");
        System.out.println("b) Giraffe");
        System.out.println("c) BLue Whale");

        System.out.println("What's the largest country on Earth by area? ");
        System.out.println("a) United States of America");
        System.out.println("b) Russia");
        System.out.println("c) Canada");

       responses[0]= scan.next();
       responses[1]= scan.next();
       responses[2]= scan.next();

        int score = 0;
        for(int i = 0; i<3; i++){
            if(responses[i].equalsIgnoreCase(answers[i])){
                score++;
            }
        }

        System.out.println(" your Score is : " +score + " /3 ") ;
    }
}