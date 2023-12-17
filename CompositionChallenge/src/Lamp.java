public class Lamp {

    private String style;
    private boolean battery;
    private int globeRating;

    public Lamp(java.lang.String style, boolean battery, int globeRating) {
        this.style = style;
        this.battery = battery;
        this.globeRating = globeRating;
    }

    public java.lang.String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobeRating() {
        return globeRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> turn on called");
    }
}
