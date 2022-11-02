package section7_OOP2.coding_exercise_37;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }

    /**
     * Gets style
     *
     * @return value of style
     */
    public String getStyle() {
        return this.style;
    }

    /**
     * Gets battery
     *
     * @return value of battery
     */
    public boolean isBattery() {
        return this.battery;
    }

    /**
     * Gets globRating
     *
     * @return value of globRating
     */
    public int getGlobRating() {
        return this.globRating;
    }
}
