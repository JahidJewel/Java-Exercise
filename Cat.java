public class Cat {

        private int position;
        private int direction; // 1 for up, -1 for down

        public Cat() {
            this.position = 0;
            this.direction = 1; // starts climbing up
        }

        public void climb() {
            if (direction == 1) {
                position++;
            } else {
                if (position > 0) {
                    position--;
                }
            }
        }

        public void reverse() {
            direction = -direction;
        }

        @Override
        public String toString() {
            String dir = (direction == 1) ? "up" : "down";
            return "Position: " + position + ", Direction: " + dir;
        }





}
