/*Student Name: Jahidul Islam
 * TRU ID: T00752321
 
 */

    public class DieTestDriver {
        public static void main(String[] args) {
            // Test 6-sided die with default constructor
            Die sixSidedDie = new Die();
            System.out.println("6-sided Die Rolls:");
            for (int i = 0; i < 12; i++) {
                sixSidedDie.roll();
                System.out.println(sixSidedDie);
            }

            System.out.println();

            // Test dice with 4, 8, 12, 20 sides
            int[] sides = {4, 8, 12, 20};
            for (int numSides : sides) {
                Die die = new Die(numSides);
                System.out.println(numSides + "-sided Die Rolls:");
                for (int i = 0; i < numSides * 2; i++) {
                    die.roll();
                    System.out.println(die);
                }
                System.out.println();
            }

            // Test an illegal number of faces
            Die illegalDie = new Die(10); // Illegal, defaults to 6-sided
            System.out.println("Illegal-sided (10) Die Rolls:");
            for (int i = 0; i < 10; i++) {
                illegalDie.roll();
                System.out.println(illegalDie);
            }
        }
    }


