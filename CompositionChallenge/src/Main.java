public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("West");
        Ceiling ceiling = new Ceiling(12,"white");
        Bed bed = new Bed("Persian",6,12,3,2);
        Lamp lamp = new Lamp("Table Lamp", false, 80);
        Bedroom bedroom = new Bedroom("My room",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.getBed().make();
        bedroom.getLamp().turnOn();
    }
}