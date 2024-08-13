

    import java.util.Random;

    public class Die {
        private int faceValue;
        private int numFaces;
        private Random rand;

        // Default constructor for a 6-sided die
        public Die() {
            this(6);
        }

        // Constructor with number of faces
        public Die(int numFaces) {
            if (numFaces == 4 || numFaces == 6 || numFaces == 8 || numFaces == 12 || numFaces == 20) {
                this.numFaces = numFaces;
            } else {
                this.numFaces = 6; // Default to 6-sided die
            }
            rand = new Random();
            roll(); // Roll to initialize faceValue
        }

        // Roll the die
        public int roll() {
            faceValue = rand.nextInt(numFaces) + 1;
            return faceValue;
        }

        // Set the face value with validation
        public void setFaceValue(int faceValue) {
            if (faceValue > 0 && faceValue <= numFaces) {
                this.faceValue = faceValue;
            }
        }

        // Get the face value
        public int getFaceValue() {
            return faceValue;
        }

        // Get the name of the current face value
        public String getFaceName() {
            switch (faceValue) {
                case 1: return "One";
                case 2: return "Two";
                case 3: return "Three";
                case 4: return "Four";
                case 5: return "Five";
                case 6: return "Six";
                case 7: return "Seven";
                case 8: return "Eight";
                case 9: return "Nine";
                case 10: return "Ten";
                case 11: return "Eleven";
                case 12: return "Twelve";
                case 13: return "Thirteen";
                case 14: return "Fourteen";
                case 15: return "Fifteen";
                case 16: return "Sixteen";
                case 17: return "Seventeen";
                case 18: return "Eighteen";
                case 19: return "Nineteen";
                case 20: return "Twenty";
                default: return "";
            }
        }

        // String representation of the die
        @Override
        public String toString() {
            return faceValue + " : " + getFaceName();
        }
    }


