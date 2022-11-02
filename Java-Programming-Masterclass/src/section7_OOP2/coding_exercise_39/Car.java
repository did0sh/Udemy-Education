package section7_OOP2.coding_exercise_39;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return this.getClass().getName() + " -> startEngine()";
    }

    public String accelerate() {
        return this.getClass().getName() + " -> accelerate()";
    }

    public String brake() {
        return this.getClass().getName() + " -> brake()";
    }

    /**
     * Gets cylinders
     *
     * @return value of cylinders
     */
    public int getCylinders() {
        return this.cylinders;
    }

    /**
     * Gets name
     *
     * @return value of name
     */
    public String getName() {
        return this.name;
    }
}
